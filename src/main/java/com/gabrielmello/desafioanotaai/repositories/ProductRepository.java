package com.gabrielmello.desafioanotaai.repositories;

import com.gabrielmello.desafioanotaai.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
