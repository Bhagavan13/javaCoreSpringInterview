package com.bhagavan.interview.Executor;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<Integer> {
	
	int num;
	public Mycallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName()+ " is calculating the sum of all numbers upto"+num);
		Integer sum=0;
		for(int i=0;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
		
	
	}

}
