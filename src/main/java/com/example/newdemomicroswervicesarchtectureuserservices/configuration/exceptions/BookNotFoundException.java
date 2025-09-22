package com.example.newdemomicroswervicesarchtectureuserservices.configuration.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) {
        super(message);
    }
}
