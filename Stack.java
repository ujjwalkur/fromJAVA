package com.company;

public class Stack {
    int stack[] = new int[10];
    int tos;

    // Initialize top-of-stack
    Stack(){
        tos = -1;
    }
    // push an item into the stack
    void push(int item){
        if(tos == 9)
          System.out.println("Stack is full");
        else
            stack[++tos] = item;
    }
    //pop an item to the stack
    int pop(){
        if (tos < 0){
            System.out.println("Stack underflow");
            return  0;
        }
        else
            return stack[tos--];

    }
}
class TestStack{
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //push some numbr into the stack
        for (int i = 0; i<10; i++ ) mystack1.push(i);
            for (int i = 10; i<20; i++) mystack2.push(i);

            //pop the numbers of the stack
        System.out.println(" stack in mystack1 : ");
        for ( int i = 0; i<10; i++);
        System.out.println(mystack1.pop());

        System.out.println(" stack in my stack2 : ");
        for (int i = 0; i<10; i++);
        System.out.println(mystack2.pop());
    }
}
