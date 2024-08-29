package org.javaacademy.core.homework.homework5.ex2;

public class Computer {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void login(String userName) {
        this.userName = userName;
    }

    public void logout() {
        this.userName = null;
    }

    public void sendMessage(String text) {
        System.out.printf("Сообщение: %s", text);
    }
}