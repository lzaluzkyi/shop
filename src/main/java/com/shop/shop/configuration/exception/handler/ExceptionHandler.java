package com.shop.shop.configuration.exception.handler;

import com.shop.shop.configuration.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler (value = NotFoundException.class)
    protected ResponseEntity handle(NotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage() ,HttpStatus.NOT_FOUND);
    }
    @org.springframework.web.bind.annotation.ExceptionHandler (value = IllegalArgumentException.class)
    protected ResponseEntity handle(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage() ,HttpStatus.CONFLICT);
    }

}
