package com.company;

class Hello{
   private String name;
    private int age;

  public String getName(){
      return name;
  }

  public int getAge(){
      return age;
  }

  public void setName(String n){
      name = n;
  }

  public void setAge(int  a){
      age = a;
  }
}

public class Index {
    public static void main(String[] args) {

        Hello hi = new Hello();

       // hi.name = "ujjwal";
        //hi.age = 20;

        hi.setName("ujjwal");
        hi.setAge(20);
        System.out.println(hi.getName());
        System.out.println(hi.getAge());
    }
}
