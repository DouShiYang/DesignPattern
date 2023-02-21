package com.example.designpattern.singleton;

/**
 * 单例模式
 * 皇帝类
 */
public class Emperor2 {

    private static final Emperor2 emperor = new Emperor2();

    private Emperor2() {
    }

    public synchronized static Emperor2 getInstance(){
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("皇帝张三");
    }
}
