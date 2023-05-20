package com.org.ProductService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.org.ProductService.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
