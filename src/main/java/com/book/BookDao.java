package com.book;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lavanya Kondragunta on 11/2/2015.
 */

@Repository            //we can also use @Component @Autowired instead of Repository
public class BookDao {
    private Map<String, Book> books = new HashMap<>();

    public BookDao() {
        Book book1 = new Book();
        book1.setId("1234");
        book1.setAuthor("author1");
        book1.setTitle("Title1");
        book1.setPubDate(new Date());
        Book book2 = new Book();
        book2.setId("2345");
        book2.setAuthor("author2");
        book2.setTitle("Title2");
        book2.setPubDate(new Date());
        books.put(book1.getId(), book1);
        books.put(book2.getId(), book2);
    }

    public Collection<Book> getAllBooks() {
        return this.books.values();
    }

    public Book getBook(String id) {
        return books.get(id);
    }
    public void addNewBook(Book book) {
        books.put(book.getId(),book);
    }

}



