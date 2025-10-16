package com.felipebarroso.product_api.repository;

import com.felipebarroso.product_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
