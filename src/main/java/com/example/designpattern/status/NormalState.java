package com.example.designpattern.status;

/**
 * 正常状态
 */
public class NormalState extends AccountState{

    public NormalState(Account account){
        this.acc =  account;
    }

    public NormalState(AccountState accountState){
       this.acc = accountState.acc;
    }

    @Override
    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance()-amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("正常状态 无需计算利息");
    }

    @Override
    public void add(double amount) {
        acc.setBalance(acc.getBalance()+amount);
        stateCheck();
    }

    @Override
    public void stateCheck() {
        if(acc.getBalance()> -2000 && acc.getBalance()<=0){
            //说明当前账户是透支状态
            acc.setAccountState(new OverdraftState(this));
        }else if(acc.getBalance()<= -2000){
            //受限状态类
            acc.setAccountState(new RestrictedState(this));
        }
    }
}
