package com.bhagavan.interview.core.contract;

import java.util.HashMap;
import java.util.Map;

//when two objects are equal, then they must have the same hash code.

/*Since employee objects won’t be implemented with the hashcode and the equals method. 
so ,employee objects can be stored as duplicate obj if you have any doubt, try comment the 
hashcode and equals method in employee.java*/

public class HashmapUsingObject {
	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<Employee,Integer>();
		Employee e1 = new Employee("naresh","AP");
		Employee e2 = new Employee("naresh","AP");
		// Using the naresh and AP it will calulate the hashcode. so when you give the same 
		// naresh and ap then it will give same thing.
		map.put(e1, 1);
		map.put(e2, 2);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(map.size());
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		System.out.println(map);
		
		
	}

}
