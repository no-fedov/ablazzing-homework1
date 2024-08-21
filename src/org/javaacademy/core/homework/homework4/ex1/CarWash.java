package org.javaacademy.core.homework.homework4.ex1;

import org.javaacademy.core.homework.homework4.ex1.car.Car;

public class CarWash {
    public static final double SMALL_SIZED_PRICE = 2000;
    public static final double LARGE_PRICE = 4000;

    public double wash(Car car) {
        car.clean();
        return checkPriceWash(car);
    }

    public double wash(Car[] cars) {
        double price = 0;
        for (Car car : cars) {
            car.clean();
            price += checkPriceWash(car);
        }
        return price;
    }

    private double checkPriceWash(Car car) {
        int counter = 0;
        counter += car.getLength() > 6 ? 1 : 0;
        counter += car.getHeight() > 2.5 ? 1 : 0;
        counter += car.getWidth() > 2 ? 1 : 0;

        if (counter >= 1) {
            return LARGE_PRICE;
        }

        return SMALL_SIZED_PRICE;
    }
}
