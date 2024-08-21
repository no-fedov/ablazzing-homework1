package org.javaacademy.core.homework.homework4.ex1.car;

public class Bus extends Car {
    private final int passengerCount;

    public Bus(double length, double width, double height, int passengerCount) {
        super(length, width, height);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}
