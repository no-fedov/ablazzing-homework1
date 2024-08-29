package org.javaacademy.core.homework.homework5.ex1;

public enum Country {
    RUSSIA("Россия"),
    FRANCE("Франция"),
    CHINA("Китай"),
    JAPAN("Япония"),
    TURKEY("Турция");

    private final String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
