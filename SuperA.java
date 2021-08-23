package com.company;

public class SuperA {
    SuperA(){
        System.out.println("Inside A's constructor");
    }
}
class SubB extends SuperA{
    SubB(){
        System.out.println("Inside B's constructor");
    }
}
class SubC extends SubB{
    SubC(){
        System.out.println("Inside C's constructor");
    }
}
class CallingCons{
    public static void main(String[] args) {
        SubC c = new SubC();

    }
}
