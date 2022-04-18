package com.example.designpattern.status;

/**
 * 状态受限类
 */
public class RestrictedState extends AccountState {


    public RestrictedState(AccountState accountState) {
        this.acc = accountState.acc;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("账号受限，无法提现");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }

    @Override
    public void add(double amount) {
       acc.setBalance(acc.getBalance()+amount);
       stateCheck();
    }

    @Override
    public void stateCheck() {
        if(acc.getBalance()>0){
            //说明当前账户是透支状态
            acc.setAccountState(new NormalState(this));
        }else if(acc.getBalance()> -2000){
            //受限状态类
            acc.setAccountState(new OverdraftState(this));
        }else if(acc.getBalance()<-2000) {
            System.out.println("状态受限");
        }
    }
}
