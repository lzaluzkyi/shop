package com.shop.shop.configuration.exception.user;

public class NoLoggedUserException extends RuntimeException{


    public NoLoggedUserException(String message) {
        super(message);
    }

    public NoLoggedUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
