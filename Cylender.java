package com.company;

import java.awt.*;

class Cylinder1{
    private int weight;
    private int radius;
    int height;

    public int getWeight() {
        return weight;
    }

    public int getRadius(){
        return radius;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    //public int getHeight(){
      //  return height;
    //}

    //public void setHeight(int height){
      //  this.height = height;
    //}

    public double surfaceArea(){
        return 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;

    }
}
public class Cylender {
    public static void main(String[] args) {

        //PROBLEM 1
       Cylinder1 myCylinder = new Cylinder1();

       myCylinder.setRadius(20);
       myCylinder.setWeight(12);
        System.out.println(myCylinder.getWeight());
        System.out.println(myCylinder.getRadius());

        System.out.println(myCylinder.surfaceArea());

        //PROBLEM 2
    }
}
// 9812118052
