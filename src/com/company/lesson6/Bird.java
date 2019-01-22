package com.company.lesson6;

import java.util.List;

public class Bird implements Flyable, Eatable {
    private List<String> wing;
    private String tale;
    int[] arr = new int[5];

    @Override
    public void fly() {
        System.out.println("The Bird is flying");

    }

    @Override
    public void eat() {
        System.out.println("The Bird is eating");

    }
}
