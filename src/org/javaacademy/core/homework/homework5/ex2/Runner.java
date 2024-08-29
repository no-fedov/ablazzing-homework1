package org.javaacademy.core.homework.homework5.ex2;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);
        computerSpy.login("Василий");
        computerSpy.sendMessage("Hello world!!!");
        computerSpy.logout();
    }
}
