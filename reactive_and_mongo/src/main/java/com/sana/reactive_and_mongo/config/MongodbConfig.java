package com.sana.reactive_and_mongo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.sana.reactive_and_mongo.repository.ArticleRepository;
import com.sana.reactive_and_mongo.document.Article;

@EnableMongoRepositories(basePackageClasses= ArticleRepository.class)
@Configuration
public class MongodbConfig {

	@Bean
	CommandLineRunner commandlinerunner(ArticleRepository artRepo)
	{
		return strings-> {
			artRepo.save(new Article(2,
                        "Pandemic due to covid-19","This article contain loos to people, death and all effects of Covid19"
                                ,"TM-1022"));
			
		};
	}
}