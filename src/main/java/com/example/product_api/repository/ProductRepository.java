package com.example.product_api.repository;

import com.example.product_api.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<ProductModel, Long> {
}
