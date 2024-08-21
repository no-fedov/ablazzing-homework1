package org.javaacademy.core.homework.homework4.ex1.car;

public class LightCar extends Car {
    private final boolean hasCruiseControl;

    public LightCar(double length, double width, double height, boolean hasCruiseControl) {
        super(length, width, height);
        this.hasCruiseControl = hasCruiseControl;
    }

    public boolean hasCruiseControl() {
        return hasCruiseControl;
    }
}
