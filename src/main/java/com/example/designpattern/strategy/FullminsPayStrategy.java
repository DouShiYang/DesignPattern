package com.example.designpattern.strategy;


/**
 * 满减活动的算法
 */
public class FullminsPayStrategy extends AbstractPayStrategy {


    @Override
    public double algorithm(double price) {

       //满减算法
        System.out.println("这是满减算法");
        return price-1;
    }
}
