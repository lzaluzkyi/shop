package com.shop.shop.configuration.exception.product;

public class ProductDontHaveNameException extends RuntimeException {

    public ProductDontHaveNameException(String message) {
        super(message);
    }

    public ProductDontHaveNameException(Throwable cause) {
        super(cause);
    }
}
