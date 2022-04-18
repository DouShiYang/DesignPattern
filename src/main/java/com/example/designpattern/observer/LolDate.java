package com.example.designpattern.observer;

public class LolDate extends Date{

    public LolDate(String allyName) {
        System.out.println(allyName+"团队组建成功");
        this.allyName = allyName;
    }

    @Override
    public void notifyAllObserver(String name) {
        System.out.println(this.allyName +"紧急通知，"+ name+" 缺个队友");
        for (Lover lover : observers) {
            if (!lover.getName().equals(name)) {
                lover.help();
            }
        }

    }
}
