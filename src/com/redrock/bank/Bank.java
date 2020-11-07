package com.redrock.bank;

public class Bank {
    private Customer[] customer;//存放多个数组
    private int numberOfCustomer;

    public Bank() {
        customer = new Customer[10];
    }
    //人员
    public void addCustomer(String f,String l) {
        customer[numberOfCustomer] = new Customer(f,l);;
        numberOfCustomer += 1;
    }
    //人数
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
    //指定位置上的客户
    public Customer getCustomer(int index) {
        if(index >= 0 && index < numberOfCustomer) {
            return customer[index];
        }
        return null;
    }

}