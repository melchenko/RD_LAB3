package com.company.lesson6.homework;

public class Executive implements Employee {
    @Override
    public void toDoSomething() {
        System.out.println("Employee doing nothing");
    }

    @Override
    public void receiveSalary() {
        System.out.println("100000");

    }
}
