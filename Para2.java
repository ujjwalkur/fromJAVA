package com.company;

public class Para2 {
    double width;
    double height;
    double depth;

    Para2(Para2 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    // Constructor used when all dimensions are satisfitd

    Para2(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimension satisfied
    Para2(){
        width = -1;
        height = -1;
        depth = -1;
    }
    // Constructor used when cube is created
    Para2(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }

}

class Para2Demo{
    public static void main(String[] args) {
        Para2 ob1 = new Para2(10, 15, 20);
        Para2 ob2 = new Para2();
        Para2 cube = new Para2(8);

        Para2 myclone = new Para2(ob1);
        double vol;

        // Get the volume of first box
        vol = ob1.volume();
        System.out.println(" Volume of ob1 is : " + vol);

        // Get the volume of second box
        vol = ob2.volume();
        System.out.println(" Volume of second is : " + vol);

        // Get the volume of clone
        vol = myclone.volume();
        System.out.println(" volume of the clone is :" + vol);

        // Get the volume of cube
        vol = cube.volume();
        System.out.println(" volume of the cube is :" +vol);

    }
}

