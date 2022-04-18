package com.example.designpattern.status;

/**
 * 透支状态
 */
public class OverdraftState extends AccountState {


    public OverdraftState(AccountState accountState) {
        this.acc = accountState.acc;
    }

    /**
     * 提现
     * @param amount
     */
    @Override
    public void withdraw(double amount) {
       acc.setBalance(acc.getBalance()-amount);
       stateCheck();
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
        }else if(acc.getBalance()== -2000){
            //受限状态类
            acc.setAccountState(new RestrictedState(this));
        }else if(acc.getBalance()<-2000) {
            System.out.println("状态受限");
        }
    }
}
