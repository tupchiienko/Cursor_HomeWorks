package com.cursor.homework15;

import org.postgresql.ds.PGSimpleDataSource;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/airport";
    private static final String USER = "postgres";
    private static final String PASSWORD = "masterpass";

    public static void main(String[] args) {
        var dataSource = new PGSimpleDataSource();
        dataSource.setURL(URL);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        var airportManager = new AirportManager(dataSource);
        System.out.println("Airport can serve " + airportManager.calculateClientCount() + " clients");
    }
}
