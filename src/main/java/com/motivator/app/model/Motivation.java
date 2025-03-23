package com.motivator.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "motivations")
public class Motivation {

    @Id
    private String id;
    private String message;   // Quote
    private String author;    // Author of the quote

    public Motivation(String message, String author) {
        this.message = message;
        this.author = author;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
