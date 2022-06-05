package com.bhagavan.interview.core;

public class Employee {
	private Integer age;
	private String Name;
	public Employee( String name,Integer age) {
		super();
		this.age = age;
		Name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	

}
