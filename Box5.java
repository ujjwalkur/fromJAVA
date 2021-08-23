// IF THE BOXES HAVE SAME DIMENSIONS
package com.company;

public class Box5 {
    double width;
    double height;
    double depth;



        // DIsolay volume of bix
        double volume(){
            return width * height  * depth;
        }
            //creatng a consteructor
        Box5() {
        System.out.println("Constructing a box : ");
        width = 15;
        height = 10;
        depth = 20;
    }
}
 //creating new class
class BoxDemo5{
     public static void main(String[] args) {
         Box5 mybox1 = new Box5();
         Box5 mybox2 = new Box5();
         double vol;

         //find the volume dof first box

         vol = mybox1.volume();
         System.out.println("Volume is : " + vol);

         //find the volume of second box
         vol = mybox2.volume();
         System.out.println("Volume is : " + vol);
     }
 }
