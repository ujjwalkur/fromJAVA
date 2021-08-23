package com.company;

public class ArguRet {
    int a;
    ArguRet (int i){
        a = i;
    }
    ArguRet incresaeByTen(){
        ArguRet temp = new ArguRet(a + 10);
        return  temp;
    }
}
class RetOb{
    public static void main(String[] args) {
        ArguRet ob1 = new ArguRet(2);
        ArguRet ob2;

        ob2 = ob1.incresaeByTen();
        System.out.println(" ob1.a " + ob1.a);
        System.out.println(" ob2.a :" + ob2.a);

        ob2 = ob2.incresaeByTen();
        System.out.println(" ob2.a after second increase " + ob2.a);
    }
}
