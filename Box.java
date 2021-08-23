//Adding a method to the box and find the volume.
package com.company;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("The volume is :");
        System.out.println(width * height * depth);
    }

}
class BoxDemo{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

//        assign the value in mybox1 instance variable
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

//    assign the value in mybox2 instance variable
        mybox2.width = 5;
        mybox2.height = 10;
        mybox2.depth = 5;

//        display the volume of mybox1
        mybox1.volume();

//        display the volume of mybox2
        mybox2.volume();
    }

}
