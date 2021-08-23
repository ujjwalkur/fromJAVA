package com.company;

public class A {
    void call(){
        System.out.println("Inside A's call method");
    }
}
class B1 extends A {
    void call() {
        System.out.println("inside B's call merhod");
    }

}

class C extends A{
    void call(){
        System.out.println("Inside C's call method");
    }
}

class Dispatch{
    public static void main(String[] args) {
        A a = new A();
        B1 b = new B1();
        C c = new C();

        A r;
        r = a;
        r.call();

        r = b;
        r.call();

        r = c;
        r.call();
    }
}