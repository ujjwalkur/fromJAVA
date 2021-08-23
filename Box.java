package com.company;

public class Box {
    private double width;
    private double height;
    private double depth;

//    Creating clone of main class
    Box(Box ob){
       width = ob.width;
       height = ob.height;
       depth = ob.depth;
    }
//    construction when all dimension are satisfied
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
//    no dimension satisfied
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
//    when cube is created
    Box(double len){
        width = height = depth = len;
    }

//  when volume return
double volume(){
        return width * height * depth;
  }
}
// crsting subclass
class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;

    }

    //  all constructon satisfied
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // not specified
    BoxWeight() {
        super();
        weight = -1;
    }

    //    creating cube
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

//    ading shipping costs
    class Shipping extends BoxWeight{
        double cost;

//      create clone
Shipping(Shipping ob){
    super(ob);
    cost = ob.cost;
   }

//        when all dimension are specified
    Shipping(double w, double h, double d, double m, double c){
    super(w, h, d, m);
    cost = c;
    }

//    default value
    Shipping(){
    super();
    cost = -1;
    }

//    creating cube
    Shipping(double len, double c, double m){
    super(len, m);
    cost = c;
    }
}

class DemoShipping{
    public static void main(String[] args) {
        Shipping shipping1 = new Shipping(10,15,20,18.2,30);
        Shipping shipping2 = new Shipping(10,45,21,42,15.45);
        double vol;

        vol = shipping1.volume();
        System.out.println("Volume of shipping1 : " +vol);
        System.out.println("weight of shipping1 : " + shipping1.weight);
        System.out.println("Shipping cost : $ " + shipping1.cost);
        System.out.println();

        vol = shipping2.volume();
        System.out.println("volume of shipping2 : " + vol);
        System.out.println("Weight of dhipping2 : " + shipping2.weight);
        System.out.println("Shipping cost : $ " + shipping2.cost);
    }
}

