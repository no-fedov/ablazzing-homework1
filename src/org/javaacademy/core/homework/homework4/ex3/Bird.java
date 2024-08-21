package org.javaacademy.core.homework.homework4.ex3;

public class Bird implements Soundable {
    private static final String BIRD_SPEECH = "Чирик.";

    @Override
    public String makeSound() {
        return BIRD_SPEECH;
    }
}
