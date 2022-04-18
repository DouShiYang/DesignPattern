package com.example.designpattern.status;


/**
 * 账户抽象状态类
 */
public abstract class AccountState {

    protected Account acc;
    /**
     * 提现
     * @param amount
     */
    public abstract void withdraw(double amount);

    /**
     * 计算利息
     */
    public abstract void computeInterest();

    /**
     * 存款
     * @param amount
     */
    public abstract void add(double amount);

    /**
     * 状态转换的代码
     */
    public abstract void stateCheck();
}
