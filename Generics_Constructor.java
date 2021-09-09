package com.company;

class GenCons{
    private double val;

    <G extends Number>GenCons(G arg){   // --> Generics Constructor
        val = arg.doubleValue();
    }
    void showVal(){
        System.out.println("Value is : " +val);
    }
}
public class Generics_Constructor {
    public static void main(String[] args) {
        GenCons test = new GenCons(45);
        GenCons test2 = new GenCons(55.4f);

        test.showVal();
        test2.showVal();
    }
}
