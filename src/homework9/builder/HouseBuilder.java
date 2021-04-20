package homework9.builder;

import homework9.model.House;

public interface HouseBuilder {
    void buildWalls(int roomsCount);

    void buildWindows(int windowsCount);

    void buildDoors(int doorsCount);

    void buildRoof();

    House getResult();
}
