// demostrate life time of a variable
package myjava;

public class LifeTime {
    public static void main(String[]args){
        int x;
        for (x = 0; x < 3; x++){
            int y = -1;
            System.out.println(" y is " + y);
            y = 100;
//            y = y - 1;
            System.out.print("y is now");
            System.out.println(y);
        }
    }
}
