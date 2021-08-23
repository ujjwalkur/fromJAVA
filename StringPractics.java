package com.company;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Locale;

public class StringPractics {
    public static void main(String[] args) {
        //Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2
        String text = "To LowreCAse";
        text = text.replace(" ", "-");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <aman> Thanks a lot";
        letter = letter.replace("<name>", "aman");
        System.out.println(letter);

        // Probem 4
        String mystring = "This  string contain   double and   triple   space";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //Problem 5
        String letter2 = " Dear harry,\n\t this java course is nice.\n\tThanks";
        System.out.println(letter2);

    }
}
