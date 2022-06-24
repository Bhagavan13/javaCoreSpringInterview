package com.bhagavan.interview.Designpatterns;


class Single1
{
	private Single1()        
	{
		
	}
	private static  Single1 single = null;
	public  static Single1  getInstance()
	{
	
	if(single==null)
	{
		synchronized (single) {
			single = new Single1();
			
		}
	}
	return single;
	}

}

public class SingletonThreadSafe {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->
		{
			Single instance = Single.getInstance();
			System.out.println(instance);
		});
		
		Thread t2 = new Thread(()->
		{
			Single instance = Single.getInstance();
			System.out.println(instance);
		});
		
		
		t1.start();
		t2.start();
	}

}

