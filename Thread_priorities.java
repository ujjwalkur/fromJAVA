package com.company;

class ThreadUjj1 extends Thread{
    public ThreadUjj1(String name){
        super(name);
    }
    public void run() {

        while (true) {
            System.out.println("thank you " + this.getName());
           // System.out.println("my thread is running");
        }
    }
}

public class Thread_priorities {
    public static void main(String[] args) {
        ThreadUjj1 tt1 = new ThreadUjj1("Ujjwal11");
        ThreadUjj1 tt2 = new ThreadUjj1("Ujjwal22");
        ThreadUjj1 tt3 = new ThreadUjj1("Ujjwal33");
        ThreadUjj1 tt4 = new ThreadUjj1("Ujjwal44");
        ThreadUjj1 tt5 = new ThreadUjj1("Ujjwal55");
        ThreadUjj1 tt6 = new ThreadUjj1("Ujjwal66");

       // tt1.setPriority(Thread.MAX_PRIORITY);
        //tt3.setPriority(Thread.MIN_PRIORITY);
        //tt5.setPriority(Thread.NORM_PRIORITY);

        tt1.start();
        try{
            tt1.join();
        }catch (Exception e){
            System.out.println(e);
        }
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();
        tt6.start();
    }

}
