package com.bhagavan.interview.java8feat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamConcept {
	public static void main(String[] args) {
		
		List<String> list =  Arrays.asList("surya","sbhagavan","kiran","anwar");
		
		long startTime = System.currentTimeMillis();
		List<String> list1=list.stream().filter(s->s.startsWith("s")).filter(s->s.length()==5).map(s->s.toUpperCase()).
		     collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("with stream "+list1+"time took"+(startTime-endTime));
		
		long startTime1 = System.currentTimeMillis();
		List<String> list2=list.parallelStream().filter(s->s.startsWith("s")).filter(s->s.length()==5).map(s->s.toUpperCase()).
		     collect(Collectors.toList());
		long endTime1 = System.currentTimeMillis();
		System.out.println("with stream "+list1+"time took"+(startTime1-endTime1));
	}

}
