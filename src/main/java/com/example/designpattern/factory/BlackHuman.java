package com.example.designpattern.factory;

/**
 * 黑种人
 */
public class BlackHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("黑人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人说的鸟语");
    }


}
