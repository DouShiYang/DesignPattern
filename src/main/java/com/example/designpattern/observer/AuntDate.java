package com.example.designpattern.observer;

/**
 * 被观察者的具体对象
 */
public class AuntDate extends Date{

    public AuntDate(String allyName) {
        System.out.println(allyName+"组建成功");
        this.allyName = allyName;
    }

    @Override
    public void notifyAllObserver(String name) {
        System.out.println(this.allyName +"紧急通知："+ name+" 正在死去活来");
        for (Lover lover : observers) {
            if (!lover.getName().equals(name)) {
                lover.help();
            }
        }

    }
}
