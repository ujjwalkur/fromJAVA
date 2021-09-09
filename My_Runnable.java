package com.company;
class Runnable_1 implements Runnable{

    public void run(){
            System.out.println("Runnable_1 Thread :");
    }
}

class Runnable_2 implements Runnable{
    public void run(){
        //int i= 0;
        for (int i=1;i<40000; i++){
            System.out.println("Runnable_2 Thread :");
           // i++;
        }
    }
}


public class My_Runnable{
    public static void main(String[] args) {
        Runnable_1 r1 = new Runnable_1();
        Thread car = new Thread(r1);

        Runnable_2 r2 = new Runnable_2();
        Thread car2 = new Thread(r2);

        car.start();
        car2.start();
    }
}
