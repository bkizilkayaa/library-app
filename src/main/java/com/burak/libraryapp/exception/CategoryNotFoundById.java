package com.burak.libraryapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CategoryNotFoundById extends RuntimeException {
    public CategoryNotFoundById(String message) {
        super(message);
    }
}
