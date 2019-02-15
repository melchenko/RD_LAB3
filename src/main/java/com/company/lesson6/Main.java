package com.company.lesson6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bird swallow = new Bird();
        Plane to154 = new Plane();
        FlyingFish fish = new FlyingFish();

        ArrayList<Flyable> flyers = new ArrayList<>();
        flyers.add(swallow);
        flyers.add(to154);
        flyers.add(fish);

        for (Flyable entity : flyers) {
            entity.fly();
            entity.sleeping();
        }
        ArrayList<Eatable> eatables = new ArrayList<>();
        eatables.add(swallow);
        eatables.add(fish);

        for (Eatable entity : eatables) {
            entity.eat();
        }

        printSeason(Season.WINTER);
        System.out.println(SeasonRu.December.toString());

    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("The winter is coming...");
                break;
            case SPRING:
                System.out.println("The spring is coming...");
                break;
            case SUMMER:
                System.out.println("The summer is coming...");
                break;
            case AUTUMN:
                System.out.println("The autumn is coming...");
                break;
        }
    }
}



