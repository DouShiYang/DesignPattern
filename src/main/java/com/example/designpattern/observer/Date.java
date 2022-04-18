package com.example.designpattern.observer;

import java.util.ArrayList;

/**
 * 被观察者对象
 */
public abstract class Date {

    //战队名称
    protected String allyName;

    //定义观察者集合用于存储所有战队队员
    protected ArrayList<Lover> observers =  new ArrayList<Lover>();

    /**
     * 注册方法
     */
    public void attach(Lover observer){
        System.out.println("【"+observer.getName()+"】加入队伍");
        observers.add(observer);
    }

    /**
     * 注销方法
     */
    public void detach(Lover observer){
        observers.remove(observer);
    }

    /**
     * 通知方法
     */
    public abstract void notifyAllObserver(String name);
}
