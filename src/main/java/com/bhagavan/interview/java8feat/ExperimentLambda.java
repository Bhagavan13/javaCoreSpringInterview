package com.bhagavan.interview.java8feat;

@FunctionalInterface
interface funInter {
	void call(String st);
}

public class ExperimentLambda {
	public static void main(String[] args) {
		funInter fun = (st)->{
			System.out.println("hi");
			};
		fun.call("surya");
	}
	
}
