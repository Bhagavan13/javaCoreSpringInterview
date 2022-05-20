package com.bhagavan.interview.java8feat;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
	public static void main(String[] args) {
List<String> list = Arrays.asList("bhagavan","surya","satish");
		
		list.stream().filter(x->x.startsWith("s")).forEach(l->
		{
			System.out.println("hi "+l);
		});

	}

}
