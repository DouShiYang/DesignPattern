package com.example.designpattern.mediator;

/**
 * 抽象中介类
 * @author jianyang
 */
public abstract class Mediator {

    /**
     * 更改组件
     * @param component 抽象组件
     */
    abstract void compenentChanged(Component component);

}
