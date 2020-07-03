package com.sana.reactive_and_mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sana.reactive_and_mongo.document.Article;


public interface ArticleRepository extends MongoRepository<Article, Integer> {
    
}
