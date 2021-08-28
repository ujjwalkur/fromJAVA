package com.company;

class NewConstructor{
    private int age;
    private String name;

    public NewConstructor(){
        age = 21;
        name = "Ujjwal";
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a) {
         age = a;
    }

    public void setName(String n){
        name = n;
    }
}
public class Constructor {
    public static void main(String[] args) {
        NewConstructor nc = new NewConstructor();

        //nc.setAge(20);
        //nc.setName("Ujjwal");

        System.out.println(nc.getAge());
        System.out.println(nc.getName());
    }
}
