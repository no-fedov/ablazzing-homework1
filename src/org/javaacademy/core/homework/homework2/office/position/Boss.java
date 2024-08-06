package org.javaacademy.core.homework.homework2.office.position;

import org.javaacademy.core.homework.homework2.office.Employee;

public class Boss {
    private final Employee employee;

    public Boss(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return employee.getName();
    }

    public void motivateManager(Manager manager) {
        System.out.println(getClass().getSimpleName() + ": " +manager.getName() + ", быстрее!");
    }
}