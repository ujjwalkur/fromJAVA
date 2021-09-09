package com.company;
class ThreadUjj extends Thread{
    public ThreadUjj(String name){
        super(name);
    }
    public void run(){
            System.out.println("my thread is running");
        }
}

/*class ThreadUjj1 extends Thread{
    public void run(){
        int i=0;
        while (i<40000) {
            System.out.println("hahahahaHahahaha");
            i++;
        }
    }
}

 */

public class MyThread {
    public static void main(String[] args) {

        ThreadUjj t1 = new ThreadUjj("Ujjwal");
       // ThreadUjj1 t2 = new ThreadUjj1();

        t1.start();
        System.out.println("The ID od this thread ia : " +t1.getId());
        System.out.println("name is " + t1.getName());
    }
}
