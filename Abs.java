package com.company;

abstract class Abs {
    abstract void callme();
    void callmetoo(){
        System.out.println("this is a concrete method");
    }

}
class Babs extends Abs{
    void callme(){
        System.out.println("B's implementation of callme");
    }
}

class Demo{
    public static void main(String[] args) {
        Babs b1 = new Babs();

        b1.callme();
        b1.callmetoo();
    }
}

