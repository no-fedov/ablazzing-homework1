package org.javaacademy.core.homework.homework2.office;

import org.javaacademy.core.homework.homework2.office.position.Boss;
import org.javaacademy.core.homework.homework2.office.position.Manager;
import org.javaacademy.core.homework.homework2.office.position.Secretary;
import org.javaacademy.core.homework.homework2.office.position.Security;

public class Office {
    private final Boss boss;
    private final Secretary secretary;
    private final Manager manager;
    private final Security security;

    public Office(Boss boss, Secretary secretary, Manager manager, Security security) {
        this.boss = boss;
        this.secretary = secretary;
        this.manager = manager;
        this.security = security;
    }

    public void workDay() {
        System.out.println("Начался рабочий день в офисе!");

        boss.motivateManager(manager);
        manager.scream();
        security.requestAdvance(secretary);
        secretary.reassurePersonnel(boss, manager, security);

        System.out.println("Рабочий день закончился. Все разошлись по домам.");
    }
}
