package com.bhagavan.interview.java8feat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByHashMap {
	
	public static void main(String[] args) {
		// For the primitive data types.
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("Bhagavan", 1);
		map.put("Kiran", 10);
		map.put("Surya", 5);
		map.put("mahi", 3);
		
		System.out.println("by key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("by value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
