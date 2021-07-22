package com.spring.api.demo.controller;

import com.spring.api.demo.service.RessourceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({RessourceNotFoundException.class})
    public ResponseEntity<Object> handleException(Exception exception) {
        return new ResponseEntity<>(exception.getMessage(),
                new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

}
