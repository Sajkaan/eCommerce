package com.acme.ecommerce.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Product with the id: " + id  + " could not be found.");
    }
}
