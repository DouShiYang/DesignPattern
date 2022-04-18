package com.example.designpattern.zhizelian;

/**
 * 董事会
 */
public class Congress extends Approver {

    public Congress(String userName) {
        super(userName);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        //正常情况下 需要推送一个消息给董事会
        System.out.println("董事会，审批采购单" + purchaseRequest.toString());
    }
}
