package com.company;
class A1{
    public int x = 12;
    private int y = 13;
    protected  int z = 14;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}


public class AccessModifier {
    public static void main(String[] args) {


     A1 a = new A1();
//a.meth1();
        System.out.println(a.x);
        System.out.println(a.z);
    }
}