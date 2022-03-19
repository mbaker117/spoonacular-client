/*
 * @author Mohammed.baker2017@gmail.com
 */
package com.mbaker.spoonacular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

/**
 * The Class SpoonacularApplication.
 */
@SpringBootApplication
public class SpoonacularApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpoonacularApplication.class, args);
	}
	
	/**
	 * Gson.
	 *
	 * @return the gson
	 */
	@Bean
	public Gson gson() {
		return new Gson();
	}

}
