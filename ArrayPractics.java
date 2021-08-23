package com.company;

public class ArrayPractics {
    public static void main(String[] args) {
  /*      float [] marks = {89.2f, 95.2f, 88.2f, 78.66f };
        float num = 88.2f;
        boolean IsInArray = false;
        for (float element:marks){
            if (num == element){
                IsInArray = true;
                break;
            }
        }

        if (IsInArray){
            System.out.println(" marks is in array");
        }else
            System.out.println(" marks is not in array");

   */

        // Problem 2

        float [] marks = {88.2f, 97.6f, 84.0f, 83.04f, 79.85f};
        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println(" Total sum of all element is : " + sum/ marks.length);
        
    }
}

