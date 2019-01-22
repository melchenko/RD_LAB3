package com.company.lesson6.homework;

public class Engineer implements Employee {
    @Override
    public void toDoSomething() {
        System.out.println("Employee is drawing");
    }

    @Override
    public void receiveSalary() {
        System.out.println("10000");

    }
}
