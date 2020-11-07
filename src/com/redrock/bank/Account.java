package com.redrock.bank;

public class Account {
    private double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amt) {
        if(amt > 0.0) {
            balance += amt;
            System.out.println("存入成功");
        }
    }
    public void withDraw(double amt) {
        if(balance < amt) {
            System.err.println("余额不足，取出失败");
            return;
        }
        balance -= amt;
        System.out.println("成功取出：" + amt);
    }


}