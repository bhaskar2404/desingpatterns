package org.desingpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookIteroable implements  Iterable<Book>{
    private List<Book> books;

    public BookIteroable() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }
}
