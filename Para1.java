package com.company;

public class Para1 {
    int a, b;

    Para1(int i, int j){
        a = i;
        b = j;
    }

// Retun true if 0 is equal to invoking object
boolean equalTo (Para1 o) {
    if (o.a == a & o.b == b) return true;
    else
        return false;
    }

}

class Para1Ob{
    public static void main(String[] args) {
        Para1 ob = new Para1(10, 20);
        Para1 ob2 = new Para1(10, 20);
        Para1 ob3 = new Para1(15, 25);
        System.out.println(" ob == ob2 : " + ob.equalTo(ob2));
        System.out.println(" ob == ob3 : " +ob.equalTo(ob3));
    }
}