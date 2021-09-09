package com.company;
//7000049563 --> Adarsh

class Sender{
    public void sent(String msg){
        System.out.println("Sending \t" + msg);
        try {
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Thread interrupted");
        }
        System.out.println("\n" + msg + "sent");
    }
}
class Sender2 extends Thread{
    private String msg;
    Sender sender;

    Sender2(String m, Sender obj){
        msg = m;
        sender = obj;
    }

    public void run() {

        synchronized (sender) {
        }
    }
}

public class Synch {
    public static void main(String[] args){
        Sender s = new Sender();
        Sender2 s2 = new Sender2(" hii", s);
        Sender2 s3 = new Sender2(" hello", s);

        s2.start();
        s3.start();

        try{
            s2.join();
            s3.join();
        }
        catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
