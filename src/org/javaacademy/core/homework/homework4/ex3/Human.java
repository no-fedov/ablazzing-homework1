package org.javaacademy.core.homework.homework4.ex3;

public class Human implements Soundable {
    private static final String HUMAN_SPEECH = "Я человек.";

    @Override
    public String makeSound() {
        return HUMAN_SPEECH;
    }
}