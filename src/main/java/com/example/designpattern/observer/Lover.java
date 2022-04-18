package com.example.designpattern.observer;

/**
 * 抽象观察者-恋人
 */
public abstract class Lover {

    public abstract String getName();

    public abstract void setName(String name);

    /**
     * 声明支援队友的方法
     */
    public abstract void help();

    /**
     * 声明遭受攻击的方法
     */
    public abstract void needYourhelp(Date subject);
}
