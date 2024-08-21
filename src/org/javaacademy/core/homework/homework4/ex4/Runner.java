package org.javaacademy.core.homework.homework4.ex4;

import org.javaacademy.core.homework.homework4.ex4.alive.exception.HuntException;
import org.javaacademy.core.homework.homework4.ex4.alive.exception.RunException;
import org.javaacademy.core.homework.homework4.ex4.alive.herbivore.Elephant;
import org.javaacademy.core.homework.homework4.ex4.alive.herbivore.Rabbit;
import org.javaacademy.core.homework.homework4.ex4.alive.predator.Tiger;
import org.javaacademy.core.homework.homework4.ex4.alive.predator.Wolf;

public class Runner {
    public static void main(String[] args) throws RunException, HuntException {
        final Tiger tiger = new Tiger(300);
        final Wolf wolf = new Wolf(50);
        final Rabbit rabbit = new Rabbit(2);
        final Elephant elephant = new Elephant(2000);

        rabbit.run();
        wolf.hunt(rabbit);
        tiger.hunt(wolf);
        tiger.hunt(elephant);
        elephant.run();

        try {
            rabbit.run();
        } catch (RunException e) {
            System.out.println(e.getMessage());
        }
    }
}