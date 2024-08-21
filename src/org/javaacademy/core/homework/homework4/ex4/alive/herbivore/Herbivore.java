package org.javaacademy.core.homework.homework4.ex4.alive.herbivore;

import org.javaacademy.core.homework.homework4.ex4.alive.Alive;
import org.javaacademy.core.homework.homework4.ex4.alive.exception.RunException;

public abstract class Herbivore extends Alive {
    public Herbivore(double weight) {
        super(weight);
    }

    public void run() throws RunException {
        if (!this.isAlive) {
            throw new RunException();
        }
    }
}
