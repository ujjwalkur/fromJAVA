package com.company;
import java.util.Scanner;
// calculate the %age of your subject

public class MarksPercentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the first subject marks : ");
        int first = scan.nextInt();

        System.out.println(" Enter the second subject marks : ");
        int second = scan.nextInt();

        System.out.println(" Enter the third subject marks");
        int third = scan.nextInt();

        System.out.println(" Enter the fourth subject marks : ");
        int fourth = scan.nextInt();

        System.out.println(" Enter the fifth subject marks : ");
        int fifth = scan.nextInt();
        float percentage = ((first + second + third + fourth + fifth)/500.0f)*100;


        System.out.println(" percentage : ");
        System.out.println( percentage );
    }
}
