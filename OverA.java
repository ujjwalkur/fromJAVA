package com.company;

public class OverA {
    int i,j;
    OverA(int a, int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("i and j : " + i + " " + j);
    }
}
class B extends OverA{
    int k;
    B(int a, int b, int c){
        super(a, b);
        k = c;
    }
    void show(String msg){
        System.out.println(msg + k);
    }
}
class Override{
    public static void main(String[] args) {
        B subB = new B(10,20,30);
        subB.show("for B");
        subB.show();
    }
}

