package com.example.designpattern.strategy;

/**
 * 优惠券算法
 */
public class DiscountStrategy extends AbstractPayStrategy{

    /**
     * 优惠的算法
     */
    @Override
    public double algorithm(double price) {
        System.out.println("这是优惠券算法");
        return price*0.5;
    }
}
