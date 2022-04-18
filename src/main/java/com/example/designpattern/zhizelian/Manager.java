package com.example.designpattern.zhizelian;

/**
 * 经理处理
 */
public class Manager extends Approver {


    public Manager(String userName) {
        super(userName);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 10000) {
            System.out.println("经理，审批采购单"+ purchaseRequest.toString());
        } else {
            //不满足条件 则进行转发
            this.successor.processRequest(purchaseRequest);
        }
    }
}
