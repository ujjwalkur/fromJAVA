package com.company;

public class NewBox {
    int i;
}
class B extends NewBox {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println(" i in super class is " + super.i);
        System.out.println(" i in sub class is : " + i);
    }
}
class Usesuper{
    public static void main(String[] args) {
        B ob = new B(2,4);
        ob.show();
    }
}