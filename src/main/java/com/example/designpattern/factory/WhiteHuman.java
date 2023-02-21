package com.example.designpattern.factory;

/**
 * 白种人
 */
public class WhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白色人类会大笑，侵略的笑声");
    }

    @Override
    public void cry() {
        System.out.println("白色人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("白色人类会说英语");
    }
}
