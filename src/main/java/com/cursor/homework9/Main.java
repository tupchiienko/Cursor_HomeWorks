package com.cursor.homework9;

import com.cursor.homework9.builder.Director;
import com.cursor.homework9.builder.HouseBuilder;
import com.cursor.homework9.builder.impl.MedievalHouseBuilder;
import com.cursor.homework9.builder.impl.ModernHouseBuilder;
import com.cursor.homework9.model.House;

public class Main {
    public static void main(String[] args) {
        System.out.println("Build medieval house:");
        HouseBuilder medievalHouseBuilder = new MedievalHouseBuilder();
        Director.buildHouse(medievalHouseBuilder, 4, 8, 2);
        House medievalHouse = medievalHouseBuilder.getResult();
        System.out.println(medievalHouse);
        System.out.println("\nBuild modern house:");
        HouseBuilder modernHouseBuilder = new ModernHouseBuilder();
        Director.buildHouse(modernHouseBuilder, 2, 3, 1);
        House modernHouse = modernHouseBuilder.getResult();
        System.out.println(modernHouse);
    }
}
