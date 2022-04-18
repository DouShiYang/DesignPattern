package com.example.designpattern.strategy;

/**
 * 满减优惠
 */
public class DiscountStrategy extends AbstractPayStrategy{

    /**
     * 满减优惠的算法
     */
    @Override
    public double algorithm(double price) {
        System.out.println("这是优惠券算法");

        return price*0.5;
    }
}
