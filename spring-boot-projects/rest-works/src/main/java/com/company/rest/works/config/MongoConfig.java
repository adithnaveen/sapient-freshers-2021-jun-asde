package com.company.rest.works.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.company.rest.works.repo.UserRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
//		return string -> 
//				userRepository.insert(new User(101, "Suhas", 1234, new Date()));
		return null; 
				 				
	}
}
