package com.company;

import java.util.Scanner;

public class Exception1{
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]= 56;
        marks[1]=66;
        marks[2]=76;    System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();

        try {
            System.out.println("level1");
            try {
                System.out.println(marks[ind]);
            }catch (Exception e){
                System.out.println("failed");
                System.out.println(e);
                System.out.println("level 2");
            }
        }
        catch (Exception e){
            System.out.println("11");

        }
        System.out.println("program is end");
    }
}
