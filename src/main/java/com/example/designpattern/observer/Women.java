package com.example.designpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 观察者-炮兵
 */
@Data
@Getter
@Setter
@AllArgsConstructor
public class Women extends Lover {

    protected String name;

    @Override
    public void help() {
        System.out.println(this.name +"：法师在此");
    }

    @Override
    public void needYourhelp(Date subject) {
        System.out.println(this.name+"：这几天心情不好，别惹我");
        subject.notifyAllObserver(this.name);
    }
}
