package com.example.designpattern.zhizelian;


/**
 * 审批者类/或者称之为抽象处理者
 */
public abstract class Approver {


    /**
     * 定义后继对象
     */
    protected Approver successor;

    /**
     * 审批者
     */
    protected String userName;


    public Approver(String userName){
        this.userName =  userName;
    }

    public void setSuccessor(Approver approver){
        this.successor = approver;
    }

    /**
     * 抽象请求处理方法
     * @param purchaseRequest
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
