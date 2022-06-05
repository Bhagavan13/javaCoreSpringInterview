package com.bhagavan.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhagavan.interview.config.TestBean;


@RestController
public class ThreadingController {
	
	@Autowired
	TestBean testBean;
	
	@Value( "${dbused}" )
	public String Dbused;
	
	@GetMapping("/orders")
	public void getUsersAndOrders()
	{
		System.out.println("working on db"+Dbused);
	}

}
