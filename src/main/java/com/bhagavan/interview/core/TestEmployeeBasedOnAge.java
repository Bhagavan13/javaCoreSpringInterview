package com.bhagavan.interview.core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestEmployeeBasedOnAge {
	
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList( new Employee("bhagavan", 23),
											 new Employee("satish", 21),
											 new Employee("kiran", 15));
		
		System.out.println(list);
		list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(l->System.out.println(l.getName()+","+l.getAge()));
		
	}

}
