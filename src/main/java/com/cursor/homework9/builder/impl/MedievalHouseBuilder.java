package com.cursor.homework9.builder.impl;

import com.cursor.homework9.model.House;
import com.cursor.homework9.builder.HouseBuilder;

public class MedievalHouseBuilder implements HouseBuilder {
    private House house;

    public MedievalHouseBuilder() {
        this.house = new House("Medieval house");
    }

    @Override
    public void buildWalls(int roomsCount) {
        house.setWallsMaterial("Stone");
        house.setRoomsCount(roomsCount);
    }

    @Override
    public void buildWindows(int windowsCount) {
        house.setWindowsMaterial("Birch wood");
        house.setWindowsCount(windowsCount);
    }

    @Override
    public void buildDoors(int doorsCount) {
        house.setDoorsMaterial("Oak wood");
        house.setDoorsCount(doorsCount);
    }

    @Override
    public void buildRoof() {
        house.setRoofMaterial("Straw");
    }

    @Override
    public House getResult() {
        return house;
    }
}
