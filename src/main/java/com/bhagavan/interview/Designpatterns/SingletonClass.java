package com.bhagavan.interview.Designpatterns;

class Single
{
	private static  Single single = null;
	private Single()
	{
		
	}
	public  static Single  getInstance()
	{
	if(single==null)
	{
		single = new Single();
	}
	return single;
	}

}

public class SingletonClass {
	
	public static void main(String[] args) {
		
		Single instance = Single.getInstance();
		Single instance1 = Single.getInstance();
		System.out.println(instance);
		System.out.println(instance1);
	}

}
