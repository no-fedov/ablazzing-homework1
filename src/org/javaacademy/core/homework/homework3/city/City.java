package org.javaacademy.core.homework.homework3.city;

import java.util.Arrays;

public class City {
    private final String name;
    private final House[] houses;

    public City(House[] houses, String name) {
        this.name = name;
        this.houses = copyHouses(houses);
    }

    public House[] getHouses() {
        return copyHouses(this.houses);
    }

    @Override
    public String toString() {
        return "Сity{"
                + Arrays.toString(houses)
                + ", name: " + name
                + '}';
    }

    private House[] copyHouses(House[] houses) {
        House[] copiedHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            copiedHouses[i] = new House(houses[i]);
        }
        return copiedHouses;
    }
}