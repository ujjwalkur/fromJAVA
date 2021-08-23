package com.company;

public class Inh_box {
    double width;
    double height;
    double depth;

    //Construct clone of box object

    Inh_box(Inh_box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    //CONSTRUCTOR USED WHEN ALL DIMENSION SPECIFIED
    Inh_box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //CONSTRUCTOR USED WHEN NO DIMENSION SPECIFIED
    Inh_box(){
        width = -1;
        height = -2;
        depth = -3;
    }

    // CONSTRUCTOR USED WHEN CUBE IS CREATED
    Inh_box(double len){
        width = height = depth = len;
    }

    // COMPUTE AND DETECT VOLUME
    double volume(){
        return width * height * depth;

    }
}

class Newbox extends Inh_box{
    double weight;
    Newbox(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}


class DemoBox{
    public static void main(String[] args) {
        Newbox mybox1 = new Newbox(10, 20, 15, 30);
        Newbox mybox2 = new Newbox(5, 10, 7, 9);
        double vol;

        vol = mybox1.volume();
        System.out.println(" Volume of mybox1 is :" + vol);
        System.out.println(" weight of mybox1 is :" +mybox1.weight);

        vol = mybox2.volume();
        System.out.println(" Volume of mtbox2 is :" + vol);
        System.out.println(" Weight of mybox2 is : " + mybox2.weight);

    }
}