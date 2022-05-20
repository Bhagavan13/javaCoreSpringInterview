package com.bhagavan.interview.java8feat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		
		Supplier<String> supplier = ()->{
			return "Empty list";
			};
		
		List<String> list = Arrays.asList("bhagavan","surya","satish");
		List<String> list1 = Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(supplier));
		
	}

}
