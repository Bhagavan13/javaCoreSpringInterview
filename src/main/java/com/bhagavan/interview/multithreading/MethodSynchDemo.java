package com.bhagavan.interview.multithreading;

class Counter
{
	 int countvar=0;
	public  synchronized void count()
	{
		System.out.println(Thread.holdsLock(getClass()));
		countvar++;
	}

}
public class MethodSynchDemo  {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		
		Thread t1 = new Thread(()->
		{
			for(int i=0;i<100000;i++)
			{
				c.count();
			}
		});
		
		Thread t2 = new Thread(()->
		{
			for(int i=0;i<100000;i++)
			{
				c.count();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		
		System.out.println(c.countvar+1);
		
	}

}
