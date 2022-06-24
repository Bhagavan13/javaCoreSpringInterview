package com.bhagavan.interview.Designpatterns;


 final class Laptop  // sol 2: make the class as final.
{
	private  String name;    // sol 1: make the variable as private
	Laptop(String name)
	{
		this.name=name;
	}
	
	public String getLaptopName()
	{
		return name;
	}

}
 
/*
 * class Tab extends Laptop { //problem 2
 * 
 * Tab(String name) { super(name); // TODO Auto-generated constructor stub }
 * 
 * }
 */

public class Immutable {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop("Dell");
		//laptop.name="HP";    // problem 1
		
		System.out.println(laptop.getLaptopName());
	}
}
