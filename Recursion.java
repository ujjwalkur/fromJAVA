package com.company;

public class Recursion {
    static int recursion(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        else {

            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= 1;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("factorial of 3 is : " + recursion(x));
    }
}
