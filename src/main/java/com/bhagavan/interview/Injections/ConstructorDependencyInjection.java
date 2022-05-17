package com.bhagavan.interview.Injections;


import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorDependencyInjection {
	
	IciciBank icici;
	
	@Autowired
	ConstructorDependencyInjection(IciciBank icici)
	{
		this.icici=icici;
	}
	
	public static void main(String[] args) {
		
		
	}

}
