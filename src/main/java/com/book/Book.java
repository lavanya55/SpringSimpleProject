package com.book;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Lavanya Kondragunta on 11/2/2015.
 */
public class Book {

    private String id;
    @NotNull(message="Title is required")
    private String title;
    @NotNull(message="Author is required")
    private String author;
    private Date pubDate;

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
