package myjava;

public class scope {
    public static void main(String[]args){
        int x;
        x = 10;
        if (x == 10){
           int y = 20;
//           x and y both know here
            System.out.println(" x and y : " + x + " " +y);
            x = y * 2;
        }
            System.out.println("x is" + x);
    }
}
