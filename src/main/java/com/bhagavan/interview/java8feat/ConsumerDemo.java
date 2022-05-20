package com.bhagavan.interview.java8feat;

import java.util.function.Consumer;

// This always takes the input and wont return anything.
// example: foreach which takes input and do nothing.

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consumer = (obj) -> {
			System.out.println("Hi " + obj);
		};
		consumer.accept("surya");

	}

}
