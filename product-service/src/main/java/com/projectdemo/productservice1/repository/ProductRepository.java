package com.projectdemo.productservice1.repository;

import com.projectdemo.productservice1.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
