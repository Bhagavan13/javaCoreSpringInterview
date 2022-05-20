package com.bhagavan.interview.java8feat;

import java.util.Comparator;
import java.util.HashSet;

public class SortByhashset {
	
	public static void main(String[] args) {
		
		HashSet<Customer> set = new HashSet<>();
		HashSet<String> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		Customer e1 = new Customer("bhagavan");
		Customer e2 = new Customer("anwar");
		Customer e3 = new Customer("krishna");
		Customer e4 = new Customer("joseph");
		Customer e5 = new Customer("joseph");
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		set1.add("bhagavan");
		set1.add("kiran");
		set1.add("anwar");
		
		set2.add(9);
		set2.add(200);
		set2.add(10);
		
		set.stream().sorted((s1,s2)-> s2.getName().compareTo(s1.getName())).forEach(l->System.out.println(l.getName()));
		System.out.println("after String sorting");
		set1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		set2.stream().sorted().forEach(System.out::println);
		
		
		
	}

}
