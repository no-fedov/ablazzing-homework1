package org.javaacademy.core.homework.homework4.ex1.car;

public abstract class Car {
    private boolean isClear = true;
    private final double length;
    private final double width;
    private final double height;

    public Car(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean isClear() {
        return isClear;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void stayDirty() {
        this.isClear = false;
    }

    public void clean() {
        this.isClear = true;
    }
}
