package org.javaacademy.core.homework.homework4.ex4.alive.herbivore;

import org.javaacademy.core.homework.homework4.ex4.alive.exception.RunException;

public class Rabbit extends Herbivore {
    private static final String RABBIT_RUN = "Кролик быстро бежит";

    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public void run() throws RunException {
        super.run();
        System.out.println(RABBIT_RUN);
    }
}
