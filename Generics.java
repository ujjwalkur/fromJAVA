package com.company;
//import java.lang.Integer;
class MyGenerics<T1, V1>{
   T1 o1;
   V1 o2;

   MyGenerics(T1 obj, V1 obj2){
       o1 = obj;
       o2 = obj2;
   }
   T1 getO1(){
       return o1;
   }
   V1 getO2(){
       return o2;
   }

   void showMe(){
       System.out.println("Type of T1 is " + o1.getClass().getName());
       System.out.println("Type of V1 is "+ o2.getClass().getName());
   }
}
public class Generics {
    public static void main(String[] args) {
      MyGenerics<Integer,String>myObj = new MyGenerics<Integer, String>(45,"This is String");

      myObj.showMe();
      int v1 = myObj.getO1();
        System.out.println(v1);
        System.out.println();

        String str2 = myObj.getO2();
        System.out.println(str2);

    }
}
