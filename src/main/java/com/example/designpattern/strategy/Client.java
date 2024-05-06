package com.example.designpattern.strategy;

public class Client {


    public static void main(String[] args) {
        Gopay gopay = new Gopay();

        //优惠券算法
        AbstractPayStrategy abstractPayStrategy = new DiscountStrategy();

        gopay.setAbstractPayStrategy(abstractPayStrategy);

        gopay.setPrice(50);
        double algorithm = gopay.algorithm();

        System.out.println("需要支付的价格是："+ algorithm);
    }
}
