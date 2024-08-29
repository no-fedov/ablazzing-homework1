package org.javaacademy.core.homework.homework5.ex2;

public class Computer {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void login(String userName) {
        if (userName == null || userName.isBlank()) {
            throw new RuntimeException("Неверное имя пользователя");
        }
        this.userName = userName;
    }

    public void logout() {
        checkAuthorization();
        this.userName = null;
    }

    public void sendMessage(String text) {
        checkAuthorization();
        System.out.printf("Сообщение: %s", text);
    }

    private void checkAuthorization() {
        if (userName == null) {
            throw new RuntimeException("Авторизуйтесь в системе");
        }
    }
}