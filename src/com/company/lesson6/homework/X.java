package com.company.lesson6.homework;

public class X extends Iphone implements MobilePhone {

    @Override
    public void ringing() {
        System.out.println("RingRing!!");
    }

    @Override
    public void vibrate() {
        System.out.println("VibrVibr!!");

    }
}
