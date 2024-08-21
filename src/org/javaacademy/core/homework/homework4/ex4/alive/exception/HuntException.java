package org.javaacademy.core.homework.homework4.ex4.alive.exception;

public class HuntException extends Exception {
    private static final String EXCEPTION_MESSAGE = "Животное не может нападать";

    public HuntException() {
        super(EXCEPTION_MESSAGE);
    }
}
