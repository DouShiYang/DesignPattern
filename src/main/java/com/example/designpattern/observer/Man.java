package com.example.designpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 观察者-辅助
 */
@Data
@Getter
@Setter
@AllArgsConstructor
public class Man extends Lover {

    private String name;



    @Override
    public void help() {
        System.out.println("坚持住：队友"+ this.name +"来了");
    }

    @Override
    public void needYourhelp(Date subject) {
        subject.notifyAllObserver(name);
    }
}
