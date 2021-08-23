package com.company;

public class Varargs {
     static void vaTest(int v[]){
         System.out.println("no of args : " + v.length + " Contents :");

         for (int x : v)
             System.out.print(x + " ");
             System.out.println();
     }

    public static void main(String[] args) {
        int n1[] = { 10 };
        int n2[] = { 1, 5 };
        int n3[] = { 2,5,5 };
        int n4[] = { };

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
        vaTest(n4);
    }
}
