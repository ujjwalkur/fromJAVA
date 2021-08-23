package myjava;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Boolean {
    public static void main(String[]args){
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        if(b)
            System.out.println("this is executed");
        b = false;
        if (b)
            System.out.println("this is not executed");
        System.out.println("10>9" +(10>9));
    }
}
