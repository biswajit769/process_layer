package com.example.service;

import java.util.List;
import com.example.model.Product;

public interface ProductService {

    // Get Operation
    List<Product> getProducts();

    // Get Operation
    Product getProduct(Long id);

    // Post Operation
    void createProduct(Product product);

    // Put Operation
    void updateProduct(Product product);

    // Delete Operation
    void deleteProduct(Long id);
}