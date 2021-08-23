// IF THE BOXES HAVE VARIOUS DIMENSIONS
package com.company;

public class Box6 {
    double width;
    double height;
    double depth;

    // This is constructor for box
    Box6(double w, double h, double d){
        width = w;
        height = h;
         depth = d;
    }
    //compute the return volume
    double volume(){
        return width * height * depth;
    }
}
// Creating new class
class Boxdemo6{
    public static void main(String[] args) {
        Box6 mybox1 = new Box6(5, 10, 8);
        Box6 mybox2 = new Box6(10, 15, 8);
        double vol;

        // Get the volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is :" +vol);

        //Get the the volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is : " + vol );
    }
}
