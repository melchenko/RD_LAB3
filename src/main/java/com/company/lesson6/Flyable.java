package com.company.lesson6;

public interface Flyable {


    void fly();

    default void sleeping() {
        System.out.println("sleeping...");
    }

}
