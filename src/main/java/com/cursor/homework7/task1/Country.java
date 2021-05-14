package com.cursor.homework7.task1;

import static com.cursor.homework7.task1.Continent.*;

public enum Country {
    UKRAINE("Ukraine", EUROPE),
    FRANCE("France", EUROPE),
    POLAND("Poland", EUROPE),
    ISRAEL("Israel", ASIA),
    USA("United States of America", NORTH_AMERICA),
    ARGENTINA("Argentina", SOUTH_AMERICA),
    AUSTRALIA("Australia", OCEANIA);

    private final String countryName;
    private final Continent continent;

    Country(String countryName, Continent continent) {
        this.countryName = countryName;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public Continent getContinent() {
        return continent;
    }
}
