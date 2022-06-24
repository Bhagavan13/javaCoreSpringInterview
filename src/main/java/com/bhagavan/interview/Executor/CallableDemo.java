package com.bhagavan.interview.Executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	
	public static void main(String[] args) {
		Mycallable[] mycallble = {new Mycallable(10),new Mycallable(20),new Mycallable(30),new Mycallable(40),new Mycallable(50),new Mycallable(60)};
		
		ExecutorService servcie = Executors.newFixedThreadPool(2);
		for (Mycallable mycallable : mycallble) {
			Future<Integer> future = servcie.submit(mycallable);
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		servcie.shutdown();
	}

}
