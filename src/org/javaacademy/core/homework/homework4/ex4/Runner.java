package org.javaacademy.core.homework.homework4.ex4;

import org.javaacademy.core.homework.homework4.ex4.alive.exception.HuntException;
import org.javaacademy.core.homework.homework4.ex4.alive.exception.RunException;
import org.javaacademy.core.homework.homework4.ex4.alive.herbivore.Elephant;
import org.javaacademy.core.homework.homework4.ex4.alive.herbivore.Rabbit;
import org.javaacademy.core.homework.homework4.ex4.alive.predator.Tiger;
import org.javaacademy.core.homework.homework4.ex4.alive.predator.Wolf;

public class Runner {
    public static void main(String[] args) {
        final Tiger tiger = new Tiger(300);
        final Wolf wolf = new Wolf(50);
        final Rabbit rabbit = new Rabbit(2);
        final Elephant elephant = new Elephant(2000);
        try {
            rabbit.run();
            wolf.hunt(rabbit);
            tiger.hunt(wolf);
            tiger.hunt(elephant);
            elephant.run();
            rabbit.run();
        } catch (RunException | HuntException e) {
            System.out.println(e.getMessage());
        }
    }
}