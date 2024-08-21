package org.javaacademy.core.homework.homework4.ex4.alive;

public abstract class Alive {
    protected boolean isAlive = true;
    protected double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public final void die() {
        this.isAlive = false;
    }
}