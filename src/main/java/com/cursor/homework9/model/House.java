package com.cursor.homework9.model;

public class House {
    private final String houseType;
    private String wallsMaterial;
    private int roomsCount;
    private String windowsMaterial;
    private int windowsCount;
    private String doorsMaterial;
    private int doorsCount;
    private String roofMaterial;

    public House(String houseType) {
        this.houseType = houseType;
    }

    public void setWallsMaterial(String wallsMaterial) {
        this.wallsMaterial = wallsMaterial;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public void setWindowsMaterial(String windowsMaterial) {
        this.windowsMaterial = windowsMaterial;
    }

    public void setWindowsCount(int windowsCount) {
        this.windowsCount = windowsCount;
    }

    public void setDoorsMaterial(String doorsMaterial) {
        this.doorsMaterial = doorsMaterial;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public void setRoofMaterial(String roofMaterial) {
        this.roofMaterial = roofMaterial;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseType='" + houseType + '\'' +
                ", wallsMaterial='" + wallsMaterial + '\'' +
                ", roomsCount=" + roomsCount +
                ", windowsMaterial='" + windowsMaterial + '\'' +
                ", windowsCount=" + windowsCount +
                ", doorsMaterial='" + doorsMaterial + '\'' +
                ", doorsCount=" + doorsCount +
                ", roofMaterial='" + roofMaterial + '\'' +
                '}';
    }
}
