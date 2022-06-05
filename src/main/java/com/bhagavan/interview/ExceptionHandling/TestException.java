package com.bhagavan.interview.ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	
	InvalidAgeException(String Str)
	{
		super(Str);
	}
}

public class TestException {
	
	public static void main(String[] args) {
		
		System.out.println("enter the age");
		Scanner in = new Scanner(System.in);
		Integer age = in.nextInt();
		try
		{
		if(age>18)
		{
			
			System.out.println("successfully saved the data");
		}
		else
		{
			throw new InvalidAgeException("Invalid age  to save");
		}
		}
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
