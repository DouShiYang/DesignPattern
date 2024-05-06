package com.example.designpattern.strategy;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 发起支付入口
 */
@Data
@Setter
@Getter
public class Gopay {

    /**
     * 维持一个对抽象策略类的引用
     */
    private AbstractPayStrategy abstractPayStrategy;

    private double price;


    public Gopay() {
    }

    public Gopay(AbstractPayStrategy abstractPayStrategy) {
        this.abstractPayStrategy = abstractPayStrategy;
    }

    public double algorithm(){
        return abstractPayStrategy.algorithm(this.price);
    }

}
