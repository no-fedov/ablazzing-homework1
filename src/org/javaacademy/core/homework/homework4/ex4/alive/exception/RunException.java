package org.javaacademy.core.homework.homework4.ex4.alive.exception;

public class RunException extends Exception {
    private static final String EXCEPTION_MESSAGE = "Животное не может бегать";

    public RunException() {
        super(EXCEPTION_MESSAGE);
    }
}
