package com.bhagavan.interview.loading;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class EagerLoading {
	EagerLoading()
	{
		System.out.println("EagerLoading object created.");
	}

}
