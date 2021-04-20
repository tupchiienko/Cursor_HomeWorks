package homework9.builder;

public class Director {
    public static void buildHouse(HouseBuilder houseBuilder, int roomsCount, int windowsCount, int doorsCount) {
        houseBuilder.buildWalls(roomsCount);
        houseBuilder.buildWindows(windowsCount);
        houseBuilder.buildDoors(doorsCount);
        houseBuilder.buildRoof();
    }
}
