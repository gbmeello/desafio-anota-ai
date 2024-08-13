package com.gabrielmello.desafioanotaai.repositories;

import com.gabrielmello.desafioanotaai.domain.category.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository  extends MongoRepository<Category, String> {
}
