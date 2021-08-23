package com.company;

abstract class FigureA {
    double dim1;
    double dim2;

    FigureA(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
//    {
//        System.out.println("Area for figure is undefined");
//        return 0;
//    }
}
class Rectangle1 extends FigureA{
    Rectangle1(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Area for Rectangle : ");
        return dim1 * dim2;
    }
}
class Triangle1 extends FigureA{
    Triangle1(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Area of triangle is : ");
        return dim1 * dim2 / 2;
    }
}

class findArea1{
    public static void main(String[] args) {
        //FigureA f = new FigureA(20,10);
        Rectangle1 r = new Rectangle1(5,8);
        Triangle1 t = new Triangle1(12,16);
        FigureA figref1;
//
//        figref1 = f;
//        System.out.println("Area is " + figref1.area());

        figref1 = r;
        System.out.println("Area is " + figref1.area());

        figref1 = t;
        System.out.println("Area is " + figref1.area());
    }
}