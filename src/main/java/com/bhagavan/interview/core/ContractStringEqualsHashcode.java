package com.bhagavan.interview.core;

/*1)This is for to check the contract between hashcode and equals method*
 * == is for the value comparison only for literals and also reference check.
 * equals() is used for the heap memory(new())and for the content comparison.
 */
/* if two objects are equal then they must have the same hashcode() 
 * 2) If two objects have the same hash code, they may or may not be equal.
 */
public class ContractStringEqualsHashcode {
	
	public static void main(String args[])
	{
		/*
		 * String a = new String("Bhagavan"); String b = "Bhagavan"; String c = new
		 * String("Bhagavan"); if(a==b && a==c) {
		 * System.out.println("A hashcode"+a.hashCode()); // prints "123" as content is
		 * same System.out.println("B hashcode"+b.hashCode()); // prints "123" as
		 * content is same System.out.println("C hashcode"+c.hashCode()); // prints
		 * "123" as content is same System.out.println("same");
		 * 
		 * }
		 */
		
		String a = "xyz";
		String b = "yxz";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		
	}

}
