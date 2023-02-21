package com.example.designpattern.singleton;

/**
 * 单例模式
 * 皇帝类
 */
public class Emperor1 {

    private static Emperor1 emperor = null;

    public Emperor1() {
    }

    public static Emperor1 getInstance(){
        if(emperor==null){
            emperor = new Emperor1();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("皇帝张三");
    }
}
