package com.company;

public class Practics {

//    PROBLEM 1
    /*static void multiply(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }

    }
    public static void main(String[] args) {
        multiply(8);

     */

//        PROBLEM 2

    /*static void pattern1(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern1(5);

    }

     */

//    PROBLEM 3
  /* static int sumNo(int n){
       //Base condition
       if (n==1){
           return 1;
       }
       return n+ sumNo(n-1);
   }

    public static void main(String[] args) {
       int c = sumNo(4);
        System.out.println(c);
    }

   */

    //PROBLEM 4
   /* static void pattern2(int n){
        for (int i=1; i<n; i++){
            for (int j=0; j<i-1; j++)
                System.out.print(" * ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        pattern2(5);
    }

    */

    //PROBLEM 5

   /* static int fib(int n) {
        if (n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        int result = fib(10);
        System.out.println(result);
    }

    */

    //PROBLEM 6
    static int sum(int...arr){
        int result = 0;
        for (int a : arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("ffrf" + sum(4,9,8));
        System.out.println("ded" + sum(4,5,6,6));
        System.out.println("krf" +sum());
     }
}
