package com.bhagavan.interview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public TestBean testBean() {
		return new TestBean();
	}
	 

}
