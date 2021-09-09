package com.company;
import java.util.*;

class My_Arraylist{
    public static void main(String[] args) {

        ArrayList<Integer>l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>();
        l1.ensureCapacity(500);

        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(3,18);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l1.addAll(l2);

//        l1.clear(); --> Clear all the element from the list
        System.out.println(l1.contains(20)); // -->
        System.out.println(l1.indexOf(2));

       for (int i=0; i< l1.size(); i++) {
            System.out.print(l1.get(i));
           System.out.print(", ");
        }
    }
}