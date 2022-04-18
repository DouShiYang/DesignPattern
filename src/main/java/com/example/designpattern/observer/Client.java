package com.example.designpattern.observer;

/**
 * 观察者模式 测试类
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("从大姨妈的角度 来学习观察者模式：");
        AuntDate subject = new AuntDate("姨妈关怀队");

        //定义3个观察者对象
        Man cavalryObserver = new Man("徐峥");
        Man gunnerObserver = new Man("段一弘");
        Women gunnerObserver1 = new Women("陶虹");
        //加入队伍
        subject.attach(cavalryObserver);
        subject.attach(gunnerObserver);
        subject.attach(gunnerObserver1);
        //陶虹需要帮助
        gunnerObserver1.needYourhelp(subject);

    }
}
