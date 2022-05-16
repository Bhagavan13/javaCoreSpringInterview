package com.bhagavan.interview.core.contract;

import java.util.HashMap;
import java.util.Map;

// when two objects are equal, then they must have the same hash code.

public class HashMapUsingString {
	public static void main(String args[]) {
	

		/*
		 * Map<String, Integer> map = new HashMap<String,Integer>(); String s1 = new
		 * String("kiran"); String s2 = new String("kiran");
		 * System.out.println(s1.hashCode()); //102057473
		 * System.out.println(s2.hashCode()); //102057473 map.put(s1, 1); map.put(s2,
		 * 2); System.out.println(map.size()); //1 System.out.println(map.get(s1)); //
		 * s1 and s2 are giving the same value bcz the have same hashocde.
		 */		
		 Map<String, Integer> map = new HashMap<String,Integer>();
		 map.put("phani", 1);
		 map.put("phani", 1);
		 map.put("phani", 2);
		 System.out.println(map.size());
		 
		 String a = "phani";
		 String b = "phani";
		 System.out.println(a.hashCode());
		 System.out.println(b.hashCode());
	}
}
