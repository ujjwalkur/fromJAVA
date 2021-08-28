package com.company;

public class Varargs {
    public static int sum(int...ujj){
        int result=0;
        for (int a:ujj){
             result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("a+b = " + sum(2,5));
        System.out.println("a+b+c = " + sum(3,7,5));
    }
}
