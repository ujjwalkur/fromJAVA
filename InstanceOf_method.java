package com.company;

class A2{
    int i,j;
}
class B2{
    int i,j;
}
class C2 extends A2{
    int K;
}
class D2 extends A2{
    int k;
}
public class InstanceOf_method {
    public static void main(String[] args) {
        A2 a2 = new A2();
        B2 b2 = new B2();
        C2 c2 = new C2();
        D2 d2 = new D2();

        if (a2 instanceof A2)
            System.out.println(" a2 instance of A2 ");

        if (b2 instanceof B2)
            System.out.println("b2 instance of B2 ");

        if (c2 instanceof C2)
            System.out.println("c2 instance if C2 ");

        if (c2 instanceof A2)
            System.out.println("c2 can be cast to A2 ");

        if (a2 instanceof C2)
            System.out.println("a2 can be cast to C2 ");
        System.out.println();

        A2 ob2;

        ob2 = d2;
        System.out.println(" ob2 now refer to d2 ");
        if (ob2 instanceof D2)
            System.out.println(" ob2 instance of D2 ");
        System.out.println();
        ob2 = c2;
        System.out.println("ob2 is now C2 ");
        System.out.println("ob2 now refer to C2 ");

        if (ob2 instanceof D2)
            System.out.println("ob can be cast to D2 ");
        else
            System.out.println("ob2 cannot be cast to D2 ");
        System.out.println();

        if (a2 instanceof Object)
            System.out.println("a2 may be cast to object ");

        if (b2 instanceof Object)
            System.out.println("b2 may be cast to object ");

        if (c2 instanceof Object)
            System.out.println("c2 may be cast to object ");

        if (d2 instanceof Object)
            System.out.println("d2 may be cast to object ");
    }
}
