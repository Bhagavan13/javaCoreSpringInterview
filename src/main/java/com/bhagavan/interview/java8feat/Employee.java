package com.bhagavan.interview.java8feat;

public class Employee implements Comparable<Employee>{
	
	String name;
	
	Employee(String name)
	{
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

}
