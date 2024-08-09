package org.javaacademy.core.homework.homework3;

import org.javaacademy.core.homework.homework3.city.City;
import org.javaacademy.core.homework.homework3.city.House;
import org.javaacademy.core.homework.homework3.phone.Iphone;
import org.javaacademy.core.homework.homework3.phone.Samsung;
import org.javaacademy.core.homework.homework3.phone.components.Camera;
import org.javaacademy.core.homework.homework3.phone.components.PhoneCase;
import org.javaacademy.core.homework.homework3.phone.components.Processor;
import org.javaacademy.core.homework.homework3.pyramid.Pyramid1;

public class Runner {
    public static void main(String[] args) {
        ex1();
        System.out.println("______________________");
        ex2();
        System.out.println("______________________");
        ex3();
        System.out.println("______________________");
        ex4();
    }

    public static void ex1() {
        org.javaacademy.core.homework.homework3.shop.Runner.main(null);
    }

    public static void ex2() {
        Samsung samsung = new Samsung(new Camera(16),
                new PhoneCase(60, 200, 15),
                new Processor[]{new Processor(1500)});
        samsung.snap();

        Iphone iphone = new Iphone(new Camera(8),
                new PhoneCase(60, 200, 10),
                new Processor[]{new Processor(1000), new Processor(1000)});
        iphone.snap();
        iphone.getProcessorsInfo();
    }

    public static void ex3() {
        new Pyramid1().print();
    }

    /**
     * Для продвинутых
     */
    public static void ex4() {
        House house1 = new House("Lenina", 1);
        House[] arrayOfHouses = new House[]{house1};

        City city = new City(arrayOfHouses, "Мурманск");
        System.out.println(city);

        House house = city.getHouses()[0];
        house.setStreet("Kotova");

        System.out.println(house);
        System.out.println(city);
    }
}