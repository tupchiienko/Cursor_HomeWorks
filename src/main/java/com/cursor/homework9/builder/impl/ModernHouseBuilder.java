package com.cursor.homework9.builder.impl;

import com.cursor.homework9.model.House;
import com.cursor.homework9.builder.HouseBuilder;

public class ModernHouseBuilder implements HouseBuilder {
    private House house;

    public ModernHouseBuilder() {
        this.house = new House("Modern house");
    }

    @Override
    public void buildWalls(int roomsCount) {
        house.setWallsMaterial("Brick");
        house.setRoomsCount(roomsCount);
    }

    @Override
    public void buildWindows(int windowsCount) {
        house.setWindowsMaterial("Metal-plastic");
        house.setWindowsCount(windowsCount);
    }

    @Override
    public void buildDoors(int doorsCount) {
        house.setDoorsMaterial("Steal");
        house.setDoorsCount(doorsCount);
    }

    @Override
    public void buildRoof() {
        house.setRoofMaterial("Tile");
    }

    @Override
    public House getResult() {
        return house;
    }
}
