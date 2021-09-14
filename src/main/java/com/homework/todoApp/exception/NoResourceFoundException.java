package com.homework.todoApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class NoResourceFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public NoResourceFoundException(String message) {
        super(message);
    }
}
