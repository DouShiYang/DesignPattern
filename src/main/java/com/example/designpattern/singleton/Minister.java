package com.example.designpattern.singleton;

/**
 * 大臣是天天要面见皇帝，今天见的皇帝和昨天的 前天的不一样 就出问题了
 *
 * 大臣类
 */
public class Minister {

    public static void main(String[] args) {

        final Emperor1 instance = Emperor1.getInstance();
        System.out.println(instance);


    }
}
