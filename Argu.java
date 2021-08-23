// Primtive type are passed by value
package com.company;

public class Argu {
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}
class ArguDemo{
    public static void main(String[] args) {
        Argu ob1 = new Argu();
        int a = 10, b = 20;
        System.out.println(" a and b before call :" +a + " " +b);
        ob1.meth(20, 30);
        System.out.println(" a and b after call : " + a + " " + b);
    }
}