package com.shop.shop.configuration.exception.product;

public class ProductDontHaveDescriptionException extends RuntimeException{

    public ProductDontHaveDescriptionException(String message) {
        super(message);
    }

    public ProductDontHaveDescriptionException(Throwable cause) {
        super(cause);
    }
}
