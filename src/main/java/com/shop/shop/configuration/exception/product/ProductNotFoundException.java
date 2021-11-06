package com.shop.shop.configuration.exception.product;

import com.shop.shop.configuration.exception.NotFoundException;

public class ProductNotFoundException extends NotFoundException {


    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductNotFoundException(Throwable cause) {
        super(cause);
    }
}
