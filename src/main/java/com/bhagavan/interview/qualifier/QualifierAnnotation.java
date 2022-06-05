package com.bhagavan.interview.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QualifierAnnotation {
	
	@Autowired
	//@Qualifier("SBI")
	Bank bank;
	
	
	@Autowired
	Bank yesBank;
	
	@GetMapping("/roe")
	public String  getRateOfinterest()
	{
		return bank.rateOfInterest();
	}
	

}
