package org.javaacademy.core.homework.homework4.ex3;

import org.javaacademy.core.homework.homework4.ex3.soundable.*;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();

        Soundable[] soundableObjects = {human, builder, driver, bird};
        for (Soundable soundableObject : soundableObjects) {
            System.out.printf("Объект издает звук: %s\n", soundableObject.makeSound());
        }
    }
}
