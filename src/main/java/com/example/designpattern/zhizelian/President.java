package com.example.designpattern.zhizelian;

/**
 * 董事长
 */
public class President extends Approver {


    public President(String userName) {
        super(userName);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 50000) {
            System.out.println("董事长，审批采购单"+ purchaseRequest.toString());
        } else {
            //不满足条件 则进行转发
            this.successor.processRequest(purchaseRequest);
        }
    }
}
