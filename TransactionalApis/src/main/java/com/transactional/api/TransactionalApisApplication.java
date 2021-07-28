package com.transactional.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;

@SpringBootApplication
public class TransactionalApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionalApisApplication.class, args);
	}
	 @Bean
	    public OkHttpClient getOkHttpClient() {
	        return new OkHttpClient();
	    }

	    @Bean
	    public ObjectMapper getObjectMapper() {
	        return new ObjectMapper();
	    }


}
