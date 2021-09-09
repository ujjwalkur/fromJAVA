//file:///C:/Users/Ujjwal%20kumar/IdeaProjects/FromOracle/com/company/package-summary.html --> My java Documentation

package com.company;

import java.util.ArrayList;

class Book2{
    public String book, author;

    public Book2(String book, String author) {
        this.book = book;
        this.author = author;
    }


}
class My_Library{
    public ArrayList<Book2>books2;
    public My_Library(ArrayList<Book2>books2){
        this.books2 = books2;
    }


    public void addBook(Book2 books2){
        System.out.println("the book has been added to this library");
        this.books2.add(books2);
    }

    public void issueBook(Book2 books2){
        System.out.println("The book has been issued from the library");
        this.books2.remove(books2);
    }

    public void returnBook(Book2 b){
        System.out.println("The book has been returned");
        this.books2.add(b);
    }


}

public class Testing {
    public static void main(String[] args){
        ArrayList<Book2>bk = new ArrayList<>();
        Book2 bb = new Book2("HHH","KKK");
        bk.add(bb);
        bk.add(new Book2("c++","ujj"));
        bk.add(new Book2("java","Uj"));
        My_Library l1 = new My_Library(bk);
        l1.addBook(new Book2("Kotlin","jack"));


    }
}
