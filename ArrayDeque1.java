package com.company;
// This is ArrayDeque concept
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.offerFirst(22);

        ad1.add(4);
        ad1.add(5);
        ad1.pollLast();

        ad1.add(6);
        ad1.add(7);

        System.out.println(ad1);
    }

}
