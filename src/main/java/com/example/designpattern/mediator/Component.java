package com.example.designpattern.mediator;

/**
 * 抽象组件
 * @author jianyang
 */
public abstract class Component {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(){
        mediator.compenentChanged(this);
    };

    abstract void update();
}
