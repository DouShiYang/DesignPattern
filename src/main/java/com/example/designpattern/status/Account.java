package com.example.designpattern.status;

import lombok.*;

/**
 * 银行账户，充当环境类
 */
@Setter
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {

    AccountState accountState;

    String owner;

    double balance;


    public Account(String owner,double init){
        this.balance= init;
        this.owner =  owner;

        this.accountState = new NormalState(this);
        System.out.println("账户开户"+ owner);
    }

    /**
     * 存款
     * @param amount 存款金额
     */
    public void add(double amount){
        System.out.println("现在账户余额："+this.balance);
        accountState.add(amount);
        System.out.println(this.owner+" 存款："+ amount);
        System.out.println("现在账户状态"+ this.accountState.getClass().getName());
        System.out.println("--------------------");
    }

    /**
     * 提现
     * @param amount 提现金额
     */
    public void withdraw(double amount){
        System.out.println("现在账户余额："+this.balance);
        accountState.withdraw(amount);
        System.out.println(this.owner+" 提现："+ amount);
        System.out.println("现在账户状态"+ this.accountState.getClass().getName());
        System.out.println("--------------------");
    }


    /**
     * 计算利息
     */
    public void computeInterest(){
        accountState.computeInterest();
    }
}
