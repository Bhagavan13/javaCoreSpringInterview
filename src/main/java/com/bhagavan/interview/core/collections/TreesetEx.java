package com.bhagavan.interview.core.collections;

import java.util.TreeSet;
	
public class TreesetEx  {
	public static void main(String[] args) {
		Employee e1 = new Employee("bhagavan");
		Employee e2 = new Employee("satish");
		Employee e3 = new Employee("Anwar");
		Employee e4 = new Employee("Anwar");
		TreeSet<Employee> ts = new TreeSet<>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		for(Employee  e:ts)
		{
			System.out.println(e.getName());
		}
		
	}

}
