package org.javaacademy.core.homework.homework4.ex4.alive.herbivore;

import org.javaacademy.core.homework.homework4.ex4.alive.exception.RunException;

public class Rabbit extends Herbivore {
    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public void run() throws RunException {
        super.run();
        System.out.println("Кролик быстро бежит");
    }
}
