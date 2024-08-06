package org.javaacademy.core.homework.homework2.office.position;

import org.javaacademy.core.homework.homework2.office.Employee;

public class Security {
    private final Employee employee;

    public Security(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return employee.getName();
    }

    public void requestAdvance(Secretary secretary) {
        System.out.println(getClass().getSimpleName() + ": " + secretary.getName()
                + ", выдайте, пожалуйста, аванс!");

    }
}