package com.example.designpattern.mediator;

/**
 * 文本框
 * @author jianyang
 */
public class TextBox extends Component{

    @Override
    void update() {
        System.out.println("客户信息增加成功后文本框清空");
    }
}
