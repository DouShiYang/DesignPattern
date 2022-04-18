package com.example.designpattern.mediator;

/**
 * 下拉框
 * @author jianyang
 */
public class ListButton extends Component{

    public void select(){
        System.out.println("列表中选中项：小龙女");
    }

    @Override
    void update() {
        System.out.println("列表中增加一项：张无忌");
    }
}
