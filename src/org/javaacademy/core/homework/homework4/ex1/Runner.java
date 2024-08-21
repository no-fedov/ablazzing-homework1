package org.javaacademy.core.homework.homework4.ex1;

import org.javaacademy.core.homework.homework4.ex1.car.Bus;
import org.javaacademy.core.homework.homework4.ex1.car.Car;
import org.javaacademy.core.homework.homework4.ex1.car.LightCar;

public class Runner {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();

        Car[] cars = {
            new LightCar(5, 2, 1.8, true),
            new LightCar(5, 2, 1.8, false),
            new LightCar(5, 2, 1.8, false),
            new LightCar(5, 2, 1.8, true),
            new Bus(12, 3, 2.3, 40),
            new Bus(12, 3, 2.3, 30),
            new Bus(12, 3, 2.3, 25),
            new Bus(12, 3, 2.3, 50),
            new Bus(12, 3, 2.3, 35)
        };

        double price = carWash.wash(cars);
        System.out.printf("Мэрия отмыла денег: %.2f\n", price);
    }
}
