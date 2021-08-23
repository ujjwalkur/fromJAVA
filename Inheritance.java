package com.company;

public class Inheritance {
    int i, j;
    void showij(){
        System.out.println(" i and j :" + i +  " " + j);

    }
}

class b extends Inheritance {
    int k;

    void showk() {
        System.out.println(" K : " + k);
    }

    void sum() {
        System.out.println(" i, j, k : " + (i + j + k));
    }
}

class SimpleInheritance{
    public static void main(String[] args) {
        var superc = new Inheritance();
        var subc = new b();

//        Contents show of super class
        superc.i = 10;
        superc.j = 20;
        System.out.println(" Contents of super class :");
        superc.showij();
        System.out.println();

//        Contents show of subclass
        subc.i = 8;
        subc.j = 9;
        subc.k = 10;
        System.out.println(" Contents of sub class : ");
        subc.showk();
        System.out.println();
        System.out.print(" Sum of i+j+k : ");
        subc.sum();
    }
}

