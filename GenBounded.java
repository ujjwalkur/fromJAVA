package com.company;

class NewGen<F extends Number>{
    F [] nums;

    NewGen(F[] f){
        this.nums = f;
    }

    double average(){
        double sum = 0.0;
        for (int i=0; i< nums.length; i++)
          sum += nums[i].doubleValue();
        return sum/ nums.length;
    }
}
public class GenBounded {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        String str[] = {"1","2","3","4","5"};
        Double dob[] = {1.0, 2.0, 3.0, 4.0, 5.0};

        NewGen<Integer>iob = new NewGen<Integer>(inums);
        double V = iob.average();
        System.out.println("Average of value is : " + V);

        NewGen<Double>idob = new NewGen<Double>(dob);
        double W = idob.average();
        System.out.println("Average if value is :" + W);

      //  NewGen<String>strob = new NewGen<String>(str);
       // double S = strob.average();
    }
}
