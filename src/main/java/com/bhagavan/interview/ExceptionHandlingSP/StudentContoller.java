package com.bhagavan.interview.ExceptionHandlingSP;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {
	
	@GetMapping("/student/{id}")
	public String getStudent(@PathVariable int id) throws StudentNotFoundException
	{
		if(id==1)
		{
			return "surya";
		}
		else
		{
			throw new StudentNotFoundException("student not found"+id);
		}
		
	}

}
