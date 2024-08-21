package org.javaacademy.core.homework.homework4.ex2;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() {
        if (isInjured) {
            throw new FlyException("Ошибка: утка подстрелена");
        }
        System.out.println("Утка летит");
    }
}