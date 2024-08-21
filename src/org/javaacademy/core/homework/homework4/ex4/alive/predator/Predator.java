package org.javaacademy.core.homework.homework4.ex4.alive.predator;

import org.javaacademy.core.homework.homework4.ex4.alive.Alive;
import org.javaacademy.core.homework.homework4.ex4.alive.exception.HuntException;

public abstract class Predator extends Alive {
    private static final int WEIGHT_COEFFICIENT = 3;

    public Predator(double weight) {
        super(weight);
    }

    public void hunt(Alive alive) throws HuntException {
        if (!this.isAlive) {
            throw new HuntException();
        }
        if (canHunt(alive)) {
            this.eat(alive);
            alive.die();
            return;
        }
        this.die();
    }

    protected boolean canHunt(Alive alive) {
        return this.weight >= alive.getWeight();
    }

    private void eat(Alive alive) {
        double changeWeight = alive.getWeight() / WEIGHT_COEFFICIENT;
        this.weight += changeWeight;
        alive.setWeight(alive.getWeight() - changeWeight);
    }
}
