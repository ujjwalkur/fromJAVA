package com.company;


class MyGen<T>{
    T myt;

    public MyGen(T t1){
        this.myt = t1;
    }

    T getMyt(){
        return myt;
    }

    // Showing T type
    void showType(){
        System.out.println("Type of T is " + myt.getClass().getName());
    }
}
public class Gen{
    public static void main(String[] args) {
        MyGen<Integer> m1 = new MyGen<>(25);
        MyGen<String> m2 = new MyGen<>("I am String");

        m1.showType();
        int V = m1.getMyt();
        System.out.println(V);
        System.out.println();

        m2.showType();
        String str = m2.getMyt();
        System.out.println("Value : " + str);
    }
}
