package com.bhagavan.interview.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Train implements Runnable {
	@Override
	public void run() {
		System.out.println("Task got created using the threadpol");

	}
}

public class ExecutorExampleExample {
	public static void main(String[] args) {
		ExecutorService exc = Executors.newFixedThreadPool(10);
		for (int i = 0; i <100; i++) {
			exc.submit(new Train());
			
		}
		exc.shutdown();
		
	}

}
