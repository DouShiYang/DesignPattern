package com.example.designpattern.zhizelian;

public class Client {


    public static void main(String[] args) {
        Approver gao, qin, liang, san, meeting;
        gao = new Director("高俊男");
        qin = new Manager("秦姐");
        liang = new President("梁");
        san = new President("三主粮");
        meeting = new Congress("董事会");

        gao.setSuccessor(qin);
        qin.setSuccessor(liang);
        liang.setSuccessor(san);
        san.setSuccessor(meeting);
        //创建提现单
        PurchaseRequest purchaseRequest = new PurchaseRequest(90000, 10001, "停车费报销款");
        gao.processRequest(purchaseRequest);


    }
}
