package com.java.javamarket.domain.repository;

import com.java.javamarket.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getall();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProoducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
