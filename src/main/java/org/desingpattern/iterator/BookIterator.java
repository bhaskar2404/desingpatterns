package org.desingpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator<Book> {
    private List<Book> book;
    private int index=0;

    public BookIterator(List<Book> book) {
        this.book=book;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index<book.size();
    }

    @Override
    public Book next() {
        if(hasNext()){
            return book.get(index++);
        }
       return null;
    }
}
