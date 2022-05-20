package com.bhagavan.interview.java8feat;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortByhasmapEmployee {
	public static void main(String[] args) {
		Map<Student, Integer> hm = new HashMap<>();
		hm.put(new Student(1, "bhagavan", 98), 1);
		hm.put(new Student(2, "surya", 76), 11);
		hm.put(new Student(1, "kiran", 19), 3);
		hm.put(new Student(1, "naresh", 12), 9);
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName))).
		forEach(System.out::println);
		
		System.out.println("by value");
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
		forEach(System.out::println);

	}

}
