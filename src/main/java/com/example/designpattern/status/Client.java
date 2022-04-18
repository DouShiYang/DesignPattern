package com.example.designpattern.status;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("杨建", 0);
        account.add(200);
        account.withdraw(5000);
        account.add(3000);
        account.computeInterest();


    }
}
