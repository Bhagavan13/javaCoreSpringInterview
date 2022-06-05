package com.bhagavan.interview.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	@Autowired
	private TestBean testbean;
	@GetMapping("/getConfig")
	public void getConfig()
	{
		testbean.method();
	}
}
