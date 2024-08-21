package org.javaacademy.core.homework.homework4.ex3;

public class Driver extends Human {
    private static final String DRIVER_SPEECH = "Я водитель.";

    @Override
    public String makeSound() {
        return DRIVER_SPEECH;
    }
}
