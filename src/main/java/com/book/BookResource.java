package com.book;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Collection;

/**
 * Created by Lavanya Kondragunta on 11/2/2015.
 */
@RestController
public class BookResource {
    //DEPENDENCY INJECTION
    @Resource
    BookDao bookDao;

    //GET ALL EXAMPLE
    @RequestMapping(method = RequestMethod.GET, value = ("/allBooks"), produces = {"application/json", "application/xml"})
    //http://localhost:8080/spring/allBooks.json or allBooks.xml
    @ResponseBody //Annotation that indicates a method return value should be bound to the web response body
    @PoweredBy("Lavanya")
    public Collection<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    //GET SPECIFIC EXAMPLE
    @RequestMapping(method = RequestMethod.GET, value = ("/allBooks/{id}"), produces = {"application/json", "application/xml"})
    //http://localhost:8080/spring/allBooks/1234.json or 1234.xml
    @ResponseBody
    public Book getBook(@PathVariable("id") String id) {
        return bookDao.getBook(id);
    }

    //POST EXAMPLE
    @RequestMapping(value=("/addBook"), method=RequestMethod.POST, consumes =  MediaType.APPLICATION_JSON_VALUE , produces = {"application/json", "application/xml"})
    //http:localhost:8080/spring/addBook.json with json input
    @ResponseBody
    public Book addBook(@Valid @RequestBody Book book){
        bookDao.addNewBook(book);
        return book;
    }
}
