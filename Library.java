package com.company;

class MyLibrary{
    String[]books;
    int no_of_books;

    MyLibrary(){
        this.books = new String[100];
    }

    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book + "has been added.");
    }

    void showAvailableBooks(){
        System.out.println("available books are");
        for (String book:this.books){
            if (book == null){
                break;

            }
            System.out.println(" * " + book );
        }

    }
    void issueBook(String book){
        for (int i=0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println(" This book has been issued ");
                this.books[i]=null;
                return;
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {
        MyLibrary l1 = new MyLibrary();
        l1.addBook("Think and grow rich");
        l1.addBook("Let us c ");
        l1.addBook("Attitude is everything ");
        l1.addBook("Algorithm ");
        l1.showAvailableBooks();
        l1.issueBook(" Algorithm ");
        l1.showAvailableBooks();
    }
}
