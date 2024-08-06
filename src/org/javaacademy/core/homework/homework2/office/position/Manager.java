package org.javaacademy.core.homework.homework2.office.position;

import org.javaacademy.core.homework.homework2.office.Employee;

public class Manager {
    private final Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return employee.getName();
    }

    public void scream() {
        System.out.println(getClass().getSimpleName() + ": Я ничего не успеваю, помогите!");
    }
}