package com.bhagavan.interview.java8feat;

import java.util.Arrays;
import java.util.List;

public class ReduceFunction {
	public static void main(String[] args) {
		
		//sum value
		List<Integer> list = Arrays.asList(1,19,3,9,5);
		Integer reduce = list.stream().reduce(1, (a,b)->a*b);
		System.out.println(reduce);
		
		//Highest value.
		Integer high=list.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(high);
	}

}
