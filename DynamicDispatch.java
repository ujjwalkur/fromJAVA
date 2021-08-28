// DYNAMIC_DISPATCH CONCEPT

package com.company;
class Phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("My phone is starting...");
    }
}

class SmartPhone extends Phone{
    public void welcome(){
        System.out.println("hello ! welcome ");
    }

    public void on(){
        System.out.println("SmartPhone is turning on...");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Phone p1 = new SmartPhone();
        p1.on();
        p1.greet();
   //     p1.welcome();  Not allowed
    }

}
