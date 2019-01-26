package com.company.lesson6;

import java.util.List;

public class FlyingFish implements Flyable, Eatable {

    private List<String> flipper;
    private String tail;

    @Override
    public void fly() {
        System.out.println("The FlyingFish is flying.");
    }

    @Override
    public void eat() {
        System.out.println("The FlyingFish is eating.");

    }
}
