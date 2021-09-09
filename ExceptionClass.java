package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "i am toString";
    }
    @Override
    public String getMessage(){
        return "i am get message";
    }

}

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        if (a<9){

            try{
                throw new MyException();
            }
                catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
