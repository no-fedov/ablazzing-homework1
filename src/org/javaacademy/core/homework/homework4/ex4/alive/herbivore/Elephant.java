package org.javaacademy.core.homework.homework4.ex4.alive.herbivore;

import org.javaacademy.core.homework.homework4.ex4.alive.exception.RunException;

public class Elephant extends Herbivore {
    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void run() throws RunException {
        super.run();
        System.out.println("Слон медленно бежит");
    }
}