// METHOD OVERRIDE

package com.company;

import java.sql.SQLOutput;

class A {
    public void methA() {
        System.out.println("This is class A method");
    }
}

    class B extends A{
    @Override
       public void methA(){
           System.out.println("This is class B Override");
       }
    }
public class Overrides {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        a1.methA();
        b1.methA();
    }
}
