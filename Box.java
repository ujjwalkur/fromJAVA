package com.company;

public class Box {
    private double width;
    private double height;
    private  double depth;

//    Construct a clone of object
    Box(Box ob){
        // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

//    Constructor used when all dimension is specified
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
//    constructor used when no dimension is satisfied
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
//    conxstructr used when cube is created
    Box(double len){
        width = height = depth = len;
    }
//    compute and return volume
    double volume(){
        return  width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;

//    create clone of the constructor
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
//    constructur when all dimension are specified
BoxWeight(double w, double h, double d, double m ){
        super(w,h,d);
        weight = m;
}
//default constructor
    BoxWeight(){
        super();
        weight = -1;
    }
//    constructor used when cube is created
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

class SuperDemo{
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20, 15, 22);
        BoxWeight mybox2 = new BoxWeight(9, 12,15,14);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(10, 20);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println( "Volume of mybox1 is : " + vol);
        System.out.println(" Weight of mybox1 is : " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println(" volume of mybox2 is : " + vol);
        System.out.println( " weight of mybox2 is : " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println(" volume of mybox3 is : " + vol);
        System.out.println(" weight of mybox3 is : " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println(" volume is mycube is :" + vol);
        System.out.println(" WEIGHT of mycube is :" + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println(" volume of myclone is : " + vol);
        System.out.println(" weight of myclone is :" + myclone.weight);
        System.out.println();
    }
}