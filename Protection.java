package com.company;
public class Protection {
    public static void main(String[] args){
//PROBLEM 1
        /*
        int i=10;
        while(i>0){
            System.out.println(i);
            i--;
        }

         */


//PROBLEM 2

       /* for (int i=10; i>=1; i--)
            System.out.println(i);

        */

//PROBLEM 3

//        program to add numbers of digit
   /*int rem;
   int sum=0;
   int n = 81;

   while (n > 0){
       rem = n%10;
       sum = sum+rem;
       n = n/10;
   }
        System.out.println(sum);

    */

//        PROBLEM 4
        int ren;
        int mul=1;
        int n = 58;
        while (n>0){
            ren = n % 10;
            mul = mul * ren;
            n = n/10;
        }
        System.out.println(mul);

    }
}
