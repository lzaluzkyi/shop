package com.shop.shop.configuration.exception.user;

public class EmailBusyException extends RuntimeException {

    public EmailBusyException(String message) {
        super(message);
    }

    public EmailBusyException(Throwable cause) {
        super(cause);
    }
}
