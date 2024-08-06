package org.javaacademy.core.homework.homework2.office.position;

import org.javaacademy.core.homework.homework2.office.Employee;

public class Secretary {
    private final Employee employee;

    public Secretary(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return employee.getName();
    }

    public void reassurePersonnel(Boss boss, Manager manager, Security security) {
        System.out.println(getClass().getSimpleName() + ": " + boss.getName() + ", не волнуйтесь, "
                + manager.getName() + " все успеет. " + security.getName() + " - подождите!");
    }
}