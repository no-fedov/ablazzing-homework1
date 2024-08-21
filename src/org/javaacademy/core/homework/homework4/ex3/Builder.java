package org.javaacademy.core.homework.homework4.ex3;

public class Builder extends Human {
    private static final String BUILDER_SPEECH = "Я строитель.";

    @Override
    public String makeSound() {
        return BUILDER_SPEECH + " " + super.makeSound();
    }
}
