package com.bhagavan.interview.java8feat;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudents {
	
	public List<Student> getStudents()
	{
		List<Student> list = new  ArrayList<Student>();
		list.add(new Student(1, "Bhagavan", 98));
		list.add(new Student(2, "kiran", 38));
		list.add(new Student(3, "Naresh", 58));
		list.add(new Student(4, "anusha", 18));
		
		return list;
	}

}
