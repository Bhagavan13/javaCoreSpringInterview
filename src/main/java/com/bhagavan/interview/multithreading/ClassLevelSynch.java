package com.bhagavan.interview.multithreading;

import java.util.Iterator;

class ClassCounter
{
	static int varCounter=0;
	public   static void count()
	{
		synchronized (ClassCounter.class) {
			varCounter++;
		}
		
	}
}
public class ClassLevelSynch {
	public static void main(String[] args) throws InterruptedException {
		ClassCounter cc = new ClassCounter();
		ClassCounter cc1 = new ClassCounter();
	Thread thread = new Thread(()->
	{
		for(int i=0;i<100000;i++)
		{
			ClassCounter.count();
		}
	});
	
	Thread thread1 = new Thread(()->
	{
		for(int i=0;i<100000;i++)
		{
			cc1.count();
		}
	});
	
	thread.start();
	thread1.start();
	thread.join();
	thread1.join();
	
	System.out.println("the final is "+cc.varCounter);
			
	}

}
