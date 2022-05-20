package com.bhagavan.interview.java8feat;

import java.util.List;

public class Student {
	
	int id;
	String Name;
	int Marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		Name = name;
		Marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}

}
