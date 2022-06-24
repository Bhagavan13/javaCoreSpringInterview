package com.bhagavan.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.bhagavan.interview.transactionalUnd.FlightBookingController;

@SpringBootApplication
@ComponentScan(basePackageClasses = FlightBookingController.class)
public class JavaCoreSpringInterviewApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(JavaCoreSpringInterviewApplication.class, args);
	        
	}

}
