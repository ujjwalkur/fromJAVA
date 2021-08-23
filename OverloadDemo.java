package com.company;

public class OverloadDemo {
    void test(){
        System.out.println(" no parameters ");
    }

    //Overload the test for one parameters
    void test (int a){
        System.out.println(" a : " + a);

        }

        // Onerload the test for two integer parameter
    void test(int a, int b){
        System.out.println(" a and b : " + a + " " +b);
    }

    // Overload the test for double parameter
    double test ( double a){
        System.out.println(" double a :" +a);
        return  a*a;
    }

}
class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        // Call the all variations of test
        ob.test();
        ob.test(10);
        ob.test(5,10);
        result = ob.test(123.4);
        System.out.println(" result of bo.tedt(123.4) :" +result);
    }

}
