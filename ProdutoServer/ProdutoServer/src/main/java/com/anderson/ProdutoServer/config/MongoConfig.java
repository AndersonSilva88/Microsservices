package com.anderson.ProdutoServer.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.anderson.ProdutoServer.repository")
public class MongoConfig {
}
