package com.company;

public class Argu2 {
    int a, b;
    Argu2(int i, int j){
        a = i;
        b = j;
    }

    // Pass an object
    void meth(Argu2 o){
        o.a *= 2;
        o.b /= 2;
    }
}

class PassRef{
    public static void main(String[] args) {
        Argu2 ob = new Argu2(20, 30);

        // Before call
        System.out.println(" a and b before call " + ob.a + " " + ob.b);

        ob.meth(ob);

        // After call
        System.out.println(" a and b after call " + ob.a + " " +ob.b);
    }
}
