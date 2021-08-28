package mypack;

public class Balance {
    String name;
    double ball;

    public Balance(String n, double b){
        name = n;
        ball = b;
    }

    public void show(){
        if (ball<0)
            System.out.print("----> ");
        System.out.println(name + ": & " + ball);
    }
}

//import mypack.*;
class Test{
    public static void main(String[] args) {
        Balance b = new Balance("aman", 20);

        b.show();
    }
}