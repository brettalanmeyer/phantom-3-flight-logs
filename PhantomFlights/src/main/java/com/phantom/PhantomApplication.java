package com.phantom;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.phantom.storage.StorageProperties;
import com.phantom.storage.StorageService;

@EnableAutoConfiguration
@EnableConfigurationProperties(StorageProperties.class)
@ComponentScan({ "com.phantom" })
public class PhantomApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhantomApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.init();
		};
	}

}
