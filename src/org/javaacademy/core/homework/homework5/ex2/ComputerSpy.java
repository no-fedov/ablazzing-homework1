package org.javaacademy.core.homework.homework5.ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ComputerSpy extends Computer {
    private static final String LOGIN_TEMPLATE = "Пользователь %s зашел";
    private static final String LOGOUT_TEMPLATE = "Пользователь вышел";
    private static final String MESSAGE_TEMPLATE = "Пользователь %s отправил сообщение: %s";
    private Computer computer;
    private final File file = new File("C:\\Users\\no_fedov\\Desktop\\ablazzing\\java_core_4\\comp.log");

    public ComputerSpy(Computer computer) {
        this.computer = computer;
        checkComputerPresence();
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
        checkComputerPresence();
    }

    @Override
    public void login(String userName) {
        computer.login(userName);
        String preparedText = String.format(LOGIN_TEMPLATE, userName);
        writeToFile(preparedText);
    }

    @Override
    public void logout() {
        computer.logout();
        writeToFile(LOGOUT_TEMPLATE);
    }

    @Override
    public void sendMessage(String text) {
        computer.sendMessage(text);
        String preparedText = String.format(MESSAGE_TEMPLATE, computer.getUserName(), text);
        writeToFile(preparedText);
    }

    private void writeToFile(String text) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(text + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
    }

    private void checkComputerPresence() {
        if (computer == null) {
            throw new RuntimeException("Вы не указали с каким компьютером работать");
        }
    }
}