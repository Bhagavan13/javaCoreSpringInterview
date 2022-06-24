package com.bhagavan.interview.Executor;

public class CheckProcessorTask implements Runnable {

	String name;

	CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " check processor has begun the processing check " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " check process has completed "+Thread.currentThread().getName());

	}

}
