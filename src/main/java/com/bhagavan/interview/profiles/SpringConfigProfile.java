package com.bhagavan.interview.profiles;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class SpringConfigProfile {
	
	@Value( "${dbused}" )
	public String Dbused;
	
	@PostConstruct
	public void envUsing()
	{
		System.out.println("working on db"+Dbused);
	}

}
