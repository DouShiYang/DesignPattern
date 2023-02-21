package com.example.designpattern.factory;

/**
 * 黄种人
 */
public class YellowHuman implements Human{


    @Override
    public void laugh() {
        System.out.println("黄色人类笑");
    }

    @Override
    public void cry() {
        System.out.println("黄色人类哭");
    }

    @Override
    public void talk() {
        System.out.println("黄色人类哼哼哈哼");
    }
}
