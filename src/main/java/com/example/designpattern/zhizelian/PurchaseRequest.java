package com.example.designpattern.zhizelian;


import lombok.*;

/**
 * 提现请求类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PurchaseRequest {


    /**
     * 提现金额
     */
    private double amount;


    /**
     * 提现单单号
     */
    private int number;

    /**
     * 采购目的
     */
    private String purpose;






}
