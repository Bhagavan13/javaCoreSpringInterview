package com.bhagavan.interview.qualifier;

import org.springframework.stereotype.Component;

@Component
public class SBI implements Bank{

	@Override
	public String  rateOfInterest() {
		// TODO Auto-generated method stub
		 double Margin=2.5;
		return "The rate of interest for the bank is"+(RBIrate+Margin);
		
		
	}

}
