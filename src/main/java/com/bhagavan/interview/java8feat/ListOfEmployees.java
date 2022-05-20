package com.bhagavan.interview.java8feat;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployees {
	

	public List<Employee> getEmployees() {
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Bhagavan"));
		employees.add(new Employee("Surya"));
		employees.add(new Employee("Anwar"));
		employees.add(new Employee("Zerodha"));
		return employees;
	}
}
