package org.javaacademy.core.homework.homework4.ex4.alive.predator;

import org.javaacademy.core.homework.homework4.ex4.alive.Alive;

public class Tiger extends Predator {
    public Tiger(double weight) {
        super(weight);
    }

    @Override
    protected boolean canHunt(Alive alive) {
        return 2 * this.weight >= alive.getWeight();
    }
}
