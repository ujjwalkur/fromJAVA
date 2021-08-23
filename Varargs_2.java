package com.company;

public class Varargs_2{
    static  void vaTest(int...v){
        System.out.print("vaTest(int...)" + "No. of argument : " + v.length + "Contents : ");
        for (int x : v)
            System.out.print( x + " ");
        System.out.println();
    }
    static void vaTest(boolean...v){
        System.out.print("vaTest(int...)" + "No. of arguments : " + v.length + " Contents : ");

        for (boolean x : v)
            System.out.print( x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10,25);
        vaTest(true, true, false);
        vaTest( 8);
    }
}
