package com.company;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class My_linkedlist {
    public static void main(String[] args) {
//        LinkedHashMap<Key, Value> = new LinkedHashMap<>();
        LinkedList<Integer>li = new LinkedList<>();
        LinkedList<Integer>li2 = new LinkedList<>();

        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        li2.add(11);
        li2.add(12);
        li2.add(13);
        li2.add(14);

        li.addAll(li2);

        for (int i=0; i<li.size(); i++){
            System.out.println(li.get(i));
        }
    }
}
