package com.bhagavan.interview.core.collections;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class SortingByHashComparator {
	public static void main(String[] args) {
		Employee e1 = new Employee("bhagavan");
		Employee e2 = new Employee("satish");
		Employee e5 = new Employee("bhagavan1");
		Employee e3 = new Employee("Anwar");
		Employee e4 = new Employee("Anwar");
		HashSet<Employee> hs = new HashSet<>();
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		System.out.println("before sorting");
		for(Employee e:hs)
		{
			System.out.println(e.getName());
		}
		TreeSet<Employee> ts = new TreeSet<Employee>(new AscendingOrder());
		ts.addAll(hs);
		System.out.println("after sorting");
		for(Employee e:ts)
		{
			System.out.println(e.getName());
		}
		
		
	}
	
}

    class AscendingOrder implements Comparator<Employee>
    {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
