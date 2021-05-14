package com.cursor.homework9.builder;

import com.cursor.homework9.model.House;

public interface HouseBuilder {
    void buildWalls(int roomsCount);

    void buildWindows(int windowsCount);

    void buildDoors(int doorsCount);

    void buildRoof();

    House getResult();
}
