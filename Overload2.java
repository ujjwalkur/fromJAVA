package com.company;

public class Overload2 {
    void test(){
        System.out.println(" no parameters ");
    }

    // Overload method for one parameters
    void test(int a){
        System.out.println(" a : " +a);
    }

    // Overload method for two parameter
    void test(int a, int b){
        System.out.println(" a and b : " + a + " " + b);
    }

    // Overload the method for double parameter
    void test(double a){
        System.out.println(" double a :" + a);
    }

}

class OverloadDemo2{
    public static void main(String[] args) {
        Overload2 ob = new Overload2();
        int i = 88;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.4);

    }
}
