package com.bhagavan.interview.multithreading;


class LockThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("does thread lock the object"+Thread.holdsLock(this));
		
		synchronized (this) {
			System.out.println("does thread lock the object"+Thread.holdsLock(this));
		}
	}
	

}
public class LockConcept {
	public static void main(String[] args) {
		
		LockThread lt = new LockThread();
		Thread t1 = new Thread(lt);
		Thread t2 = new Thread(lt);
		t1.start();
		t2.start();
	}

}
