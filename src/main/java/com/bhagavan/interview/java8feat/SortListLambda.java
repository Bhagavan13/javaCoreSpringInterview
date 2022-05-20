package com.bhagavan.interview.java8feat;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListLambda {
	
	public static void main(String[] args) {
		ListOfStudents los = new ListOfStudents();
		List<Student> students = los.getStudents();
		//using collections sorting
		Collections.sort(students,(s1,s2)-> s2.getMarks()-s1.getMarks()); //sorting the list Asc/desc  order
		System.out.println(students);
		
		// Using Lambda expressions
		ListOfEmployees loe = new ListOfEmployees();
		List<Employee> employes = loe.getEmployees();
		employes.stream().sorted((s1,s2)-> s2.getName().compareTo(s1.getName())).forEach(l1->{
			System.out.println(l1.getName());
			
			// Another way of doing ==> method references
		});
		
		System.out.println("using method references");
		  employes.stream().sorted(Comparator.comparing(Employee::getName)).forEach(l1->
		  {
			  System.out.println(l1.getName());
		  });
		
		
	}

}
