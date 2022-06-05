package com.bhagavan.interview.multithreading;

class Hi implements Runnable{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("hi" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
class Hello implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("hello" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
public class usingThreads {
	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}
