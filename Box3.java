package com.company;

public class Box3{
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}
class BoxDemo2{
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        double vol;

        //assign the value in mybox1's instance variable
        mybox1.width = 2;
        mybox1.height = 5;
        mybox1.depth = 8;

        // asign the value in mybox2's instance variable
        mybox2.width = 5;
        mybox2.height = 8;
        mybox2.depth = 3;

        //find the volume of mybox1
        vol = mybox1.volume();
        System.out.println("volume is : " +vol );

        //Find the volume of mybox2
        vol = mybox2.volume();
        System.out.println("volume is :" +vol );

    }

}