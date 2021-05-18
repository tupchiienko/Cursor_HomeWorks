package com.cursor.homework15;

import org.postgresql.ds.PGSimpleDataSource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AirportManager {
    private final PGSimpleDataSource dataSource;

    public AirportManager(PGSimpleDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int calculateClientCount() {
        var pilotList = getPilotList();
        var planeList = getPlaneList();
        var modelPlaneMap = planeList.stream().collect(Collectors.groupingBy(Plane::getModel));
        var modelPilotMap = pilotList.stream().collect(Collectors.groupingBy(Pilot::getPlaneModel));
        var clientCount = 0;
        var usedPlanes = getUsedPlanesList(modelPlaneMap, modelPilotMap);
        for (Plane plane : usedPlanes) {
            clientCount += plane.getSeats();
        }
        return clientCount;
    }

    private List<Plane> getUsedPlanesList(Map<String, List<Plane>> modelPlaneMap,
                                           Map<String, List<Pilot>> modelPilotMap) {
        var usedPilots = new ArrayList<Pilot>();
        var usedPlanes = new ArrayList<Plane>();
        for (Map.Entry<String, List<Pilot>> modelPilotEntry : modelPilotMap.entrySet()) {
            var planeModel = modelPilotEntry.getKey();
            var pilots = modelPilotEntry.getValue();
            pilots.removeAll(usedPilots);
            int freePlanesCount = (pilots.size() % 2 == 0) ? pilots.size() / 2 : (pilots.size() - 1) / 2;
            for (var i = 0; i < freePlanesCount * 2; i++) {
                usedPilots.add(pilots.get(i));
            }
            fillUsedPlanesList(modelPlaneMap, usedPlanes, planeModel, freePlanesCount);
        }
        return usedPlanes;
    }

    private void fillUsedPlanesList(Map<String, List<Plane>> modelPlaneMap,
                                    ArrayList<Plane> usedPlanes,
                                    String planeModel,
                                    int freePlanesCount) {
        for (Map.Entry<String, List<Plane>> modelPlaneEntry : modelPlaneMap.entrySet()) {
            if (modelPlaneEntry.getKey().equals(planeModel)) {
                var planes = modelPlaneEntry.getValue();
                planes.removeAll(usedPlanes);
                for (Plane plane : planes) {
                    if (plane.getModel().equals(planeModel)) {
                        if (freePlanesCount == 0) {
                            break;
                        }
                        usedPlanes.add(plane);
                        freePlanesCount--;
                    }
                }
            }
        }
    }

    private List<Pilot> getPilotList() {
        var sqlQuery = "SELECT * FROM pilot";
        var pilotList = new ArrayList<Pilot>();
        try (var connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            var resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                var pilot = new Pilot(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("plane_model"));
                pilotList.add(pilot);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pilotList;
    }

    private List<Plane> getPlaneList() {
        var sqlQuery = "SELECT * FROM plane";
        var planeList = new ArrayList<Plane>();
        try (var connection = dataSource.getConnection();
             var statement = connection.createStatement()) {
            var resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                var plane = new Plane(resultSet.getInt("id"),
                        resultSet.getString("model"),
                        resultSet.getString("serial_number"),
                        resultSet.getInt("seats"));
                planeList.add(plane);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return planeList;
    }
}
