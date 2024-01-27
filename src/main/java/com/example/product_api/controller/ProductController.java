package com.example.product_api.controller;

import com.example.product_api.model.ProductModel;
import com.example.product_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    private ProductRepository _productRepository;


    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public List<ProductModel> getAllProducts(){
        return _productRepository.findAll();
    }
}
