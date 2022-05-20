package com.bhagavan.interview.java8feat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> list = Arrays.asList('a','b','c','d');
		List<Character> collect = list.stream().map(l->Character.toUpperCase(l)).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		
	

	}

}
