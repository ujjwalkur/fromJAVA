package com.company;
interface camera{
    void takePhoto();
    void recordVideo();

    // Private method
    private void greet(){
        System.out.println("Good morning");
    }
    // default method
    default void record4kVideo(){

        System.out.println("Recording 4k video...");
        greet();
    }
}

interface music{
    void playMusic();
    void stopMusic();
}

class CellPhone{
    void call(int number){
        System.out.println(" CALLING... " + number);
    }

    void receiveCall(){
        System.out.println(" Taking call...");
    }
}

class MySmartPhone extends CellPhone implements camera,music{
    void takeSnap(){
        System.out.println("Taking snap");
    }

    public void takePhoto(){
        System.out.println("Clicking Photos...");
    }

    public void recordVideo(){
        System.out.println("Recording start... ");
    }

    public void playMusic(){
        System.out.println("Playing music...");
    }
    public void stopMusic(){
        System.out.println("Music is stop.");
    }

}
public class MyPhone {
    public static void main(String[] args) {
        MySmartPhone my1 = new MySmartPhone();

        my1.playMusic();
        my1.recordVideo();
        my1.stopMusic();
        my1.takePhoto();
        my1.takeSnap();
        my1.call(55);
        my1.receiveCall();
        my1.record4kVideo();
       // my1.greet(); = throws error
    }
}
