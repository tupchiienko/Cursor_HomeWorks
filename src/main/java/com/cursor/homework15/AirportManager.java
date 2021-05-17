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
        var busyPilots = new ArrayList<Pilot>();
        for (Map.Entry<String, List<Pilot>> entry : modelPilotMap.entrySet()) {
            var planeModel = entry.getKey();
            var pilots = entry.getValue();
            pilots.removeAll(busyPilots);
            int planesCount = (pilots.size() % 2 == 0) ? pilots.size() / 2 : (pilots.size() - 1) / 2;
            for (var i = 0; i < planesCount * 2; i++) {
                busyPilots.add(pilots.get(i));
            }
            clientCount += planesCount * modelPlaneMap.get(planeModel).get(0).getSeats();
        }
        return clientCount;
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
