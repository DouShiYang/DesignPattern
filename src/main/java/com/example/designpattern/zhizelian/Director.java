package com.example.designpattern.zhizelian;

/**
 * 主任
 */
public class Director extends Approver {


    public Director(String userName) {
        super(userName);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 5000) {
            System.out.println("主任，审批采购单"+ purchaseRequest.toString());
        } else {
            //不满足条件 则进行转发
            this.successor.processRequest(purchaseRequest);
        }
    }
}
