package org.javaacademy.core.homework.homework3.shop;

/**
 * Покупатель
 */
public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void checkShop(Shop shop) {
        boolean condition1 = shop.isFloorClear() && shop.shouldWorkersBadges();
        boolean condition2 = shop.getWorkersCount() > 2 && shop.isFloorClear();
        boolean condition3 = shop.getWorkersCount() > 2 && shop.shouldWorkersBadges();

        if (condition1 || condition2 || condition3) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}
