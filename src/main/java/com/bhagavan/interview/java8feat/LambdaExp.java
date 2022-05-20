package com.bhagavan.interview.java8feat;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LambdaExp {
	public static void main(String args[]) {
		ListOfEmployees li = new ListOfEmployees();
		List<Employee> list = li.getEmployees();
		Collections.sort(list,(l1,l2)->l1.getName().compareTo(l2.getName())); //very important for sorting.
		
		System.out.println("After Sorting");
		for(Employee e:list)
		{
		System.out.println(e.getName());
		}
		
		System.out.println("For hashset before soring");
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("Bhagavan"));
		employees.add(new Employee("Surya"));
		employees.add(new Employee("Anwar"));
		employees.add(new Employee("Zerodha"));
		TreeSet<Employee> ts = new TreeSet<>(employees);
		for(Employee e:ts)
		{
		System.out.println(e.getName());
		}

	}
}
