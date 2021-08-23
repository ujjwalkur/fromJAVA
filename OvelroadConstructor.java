package com.company;

public class OvelroadConstructor {
    double width;
    double height;
    double depth;

    //constructur whe-**n all dimension satisfied
    OvelroadConstructor( double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimension satisfied

    OvelroadConstructor(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor used when creating cube
    OvelroadConstructor(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth;
    }

}

class OverloadConstructorDemo{
    public static void main(String[] args) {
        OvelroadConstructor ob = new OvelroadConstructor(10,20, 15);
        OvelroadConstructor ob2 = new OvelroadConstructor();
        OvelroadConstructor ob3 = new OvelroadConstructor(10);
        double vol;

        // Get the volume of first OverloadConstructor
        vol = ob.volume();
        System.out.println(" volume of ob is : " +vol);

        // get the volume of ob2
        vol = ob2.volume();
        System.out.println(" volume of ob2 is : " + vol);

        // get the volume of ob3
        vol = ob3.volume();
        System.out.println(" volume of ob3 is :" + vol);
    }
}
