package com.bhagavan.interview.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // This will be injected during run time when beans are of same type.

public class YesBank implements Bank{

	@Override
	public String rateOfInterest() {
		// TODO Auto-generated method stub
		 double Margin=3.5;
		return "The rate of interest for the bank is"+(RBIrate+Margin);
		
		
	}

}
