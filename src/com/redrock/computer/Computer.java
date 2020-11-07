package com.redrock.computer;


import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        double a,b;
        char x;
        System.out.println("请输入数字，要加空格");
        while(true) {
            Scanner cin = new Scanner(System.in);
            a = cin.nextDouble();
            x = cin.next().charAt(0);
            b = cin.nextDouble();
            Usefuhao u = new Usefuhao();
            u.start(x, a, b);
        }
    }
}

class Usefuhao {
    public void start(char x,double a,double b){
        switch (x){
            case '+':
                jia j = new jia();
                System.out.println(a + "+" + b + "="+j.yunxin(a,b));
                break;
            case '-':
                jian jan = new jian();
                jan.yunxin(a,b);
                System.out.println(a + "-" + b + "="+jan.yunxin(a,b));
                break;
            case '*':
                chen c = new chen();
                System.out.println(a + "*" + b + "=" +c.yunxin(a,b));
                break;
            case '/':
                chu cu = new chu();
                System.out.println(a + "/" + b + "="+cu.yunxin(a,b));
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}


abstract interface fuhao {
    public abstract double yunxin(double n,double b);
}

class jia implements fuhao {
    public double yunxin(double a,double b) {
        return a+b;
    }
}
class jian implements fuhao {
    public double yunxin(double a,double b){
        return  a-b;
    }
}
class chen implements fuhao {
    public double yunxin(double a,double b){
        return a*b;
    }
}
class chu implements fuhao {
    public double yunxin(double a,double b){
        return a/b;
    }
}