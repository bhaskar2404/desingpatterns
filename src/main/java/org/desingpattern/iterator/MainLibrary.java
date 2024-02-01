package org.desingpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class MainLibrary {

    public static void main(String[] args) {
        BookIteroable bookIteroable=new BookIteroable();
        Book book1=new Book(1,"Java");
        Book book2=new Book(1,"Spring");
        Book book3=new Book(1,"JPA");
        Book book4=new Book(1,"Json");
        Book book5=new Book(1,"React");
        Book book6=new Book(1,"JavaScript");

        bookIteroable.addBook(book1);
        bookIteroable.addBook(book2);
        bookIteroable.addBook(book3);
        bookIteroable.addBook(book4);
        bookIteroable.addBook(book5);
        bookIteroable.addBook(book6);

        Iterator<Book> books= bookIteroable.iterator();
        while (books.hasNext()){
            System.out.println(books.next());
        }
    }
}
