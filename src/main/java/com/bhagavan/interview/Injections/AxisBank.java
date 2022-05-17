package com.bhagavan.interview.Injections;

import org.springframework.stereotype.Component;

@Component
public class AxisBank implements BankApp{
	
	int Balance=100;
	String Name="surya";

	@Override
	public String deposit() {
		return "deposit initiated."+Balance+","+Name;
		
	}
	
}
