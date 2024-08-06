package org.javaacademy.core.homework.homework2.office;

import org.javaacademy.core.homework.homework2.office.position.Boss;
import org.javaacademy.core.homework.homework2.office.position.Manager;
import org.javaacademy.core.homework.homework2.office.position.Secretary;
import org.javaacademy.core.homework.homework2.office.position.Security;

public class Runner {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Петр Николаевич");
        Employee employee2 = new Employee("Володя");
        Employee employee3 = new Employee("Петрович");
        Employee employee4 = new Employee("Секретарь");

        Boss boss = new Boss(employee1);
        Manager manager = new Manager(employee2);
        Security security = new Security(employee3);
        Secretary secretary = new Secretary(employee4);

        Office office = new Office(boss,secretary,manager,security);
        office.workDay();
    }
}