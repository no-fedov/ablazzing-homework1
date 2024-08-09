package org.javaacademy.core.homework.homework3.city;

public class House {
    private String street;
    private int number;


    public House(String street, int number) {
        this.number = number;
        this.street = street;
    }

    public House(House house) {
        this.number = house.getNumber();
        this.street = house.getStreet();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "House{"
                + "street: " + street
                + ", house: " + number
                + '}';
    }
}
