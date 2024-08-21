package org.javaacademy.core.homework.homework4.ex2;

public class Airplane implements Flyable {
    private int passengerCount;

    public Airplane(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public void fly() {
        if (passengerCount < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
        System.out.println("Самолёт летит");
    }
}