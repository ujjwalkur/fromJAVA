package com.company;
abstract class Parent{
    public Parent(){
        System.out.println("Constructor of Parent class");
    }
   abstract public void greet();

   public void hello(){
        System.out.println("hello & welcome ");
    }
}
class Parent2 extends Parent{
@Override
    public void greet(){
        System.out.println("again good morning");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Parent2 p2 = new Parent2();
        p2.greet();
        p2.hello();
    }

}
