package com.bhagavan.interview.loading;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LazyLoading {

	LazyLoading()
	{
		System.out.println("LazyLoading object created.");
	}
	
	void call()
	{
		System.out.println("lazy called");
	}
}
