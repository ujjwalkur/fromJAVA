package com.company;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("Area for figure is undefined");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Area for Rectangle : ");
        return dim1 * dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Area of triangle is : ");
        return dim1 * dim2 / 2;
    }
}

class findArea{
    public static void main(String[] args) {
        Figure f = new Figure(20,10);
        Rectangle r = new Rectangle(5,8);
        Triangle t = new Triangle(12,16);
        Figure figref;

        figref = f;
        System.out.println("Area is " + figref.area());

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }
}