package com.bhagavan.interview.core.Threading;

//Remember we also have to use the implements runnable instead of extends as we know that we can't extend the 
//one more class as it does not support the multiple inheritance.

class usingRunnable implements Runnable
{
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(5);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class UseJoin {
	
	public static void main(String[] args) throws InterruptedException {
		usingRunnable ur = new usingRunnable();
		//usingRunnable ur1 = new usingRunnable();
		
		Thread th = new Thread(ur);
		Thread th1 = new Thread(ur);
		th.start();
		//th.join();
		th1.start();
		
		//Basicallly join method will help to complete the execution of a thread then only it gives chance 
		//to other thread.
		
	}
	

}
