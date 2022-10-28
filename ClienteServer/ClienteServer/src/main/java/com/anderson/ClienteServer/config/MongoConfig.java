package com.anderson.ClienteServer.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.anderson.ClienteServer.repository")
public class MongoConfig {

}
