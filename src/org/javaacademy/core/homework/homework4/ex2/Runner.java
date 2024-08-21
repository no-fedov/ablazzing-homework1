package org.javaacademy.core.homework.homework4.ex2;

public class Runner {
    public static void main(String[] args) {
        Flyable[] flyableObjects = {new Duck(false),
                                    new Duck(true),
                                    new Airplane(10),
                                    new Airplane(-1)};

        for (Flyable flyable : flyableObjects) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
