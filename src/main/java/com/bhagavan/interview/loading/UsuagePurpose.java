package com.bhagavan.interview.loading;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuagePurpose {
	
	@Autowired
	private LazyLoading lazyLoading;
	
	
	@PostConstruct
	public void call()
	{
		lazyLoading.call();
	}
	

}
