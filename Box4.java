package com.company;

public class Box4 {
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo4{
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        //initialize each box
        mybox1.setDim(10, 15, 20);
        mybox2.setDim(5, 10, 5);

        //get the volume of mybox1
        vol = mybox1.volume();
        System.out.println("volume is : " +vol);

        //get the volume of mybox2
        vol = mybox2.volume();
        System.out.println("volume is : " +vol);
    }
}