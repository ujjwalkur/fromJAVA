package com.company;

interface RedBicycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class BlueCycle implements RedBicycle{
    void blowHorn(){
        System.out.println("hat ja samne se");
    }

    public void applyBreak(int decrement){
        System.out.println("break is applying...");
    }

    public void speedUp(int increment){
        System.out.println("speeding up...");
    }
}
public class Bicycle {
    public static void main(String[] args) {
        BlueCycle c1 = new BlueCycle();
        c1.applyBreak(8);
        c1.speedUp(4);
        c1.blowHorn();
    }
}
