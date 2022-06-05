package com.bhagavan.interview.multithreading;

public class Java8StyleIMP {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"Hi thread");
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"Hello thread");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		long time1 = System.currentTimeMillis();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		long time2 = System.currentTimeMillis();

		System.out.println("The time took is with  using threads " + ((time2 - time1) / 1000));
		System.out.println("i am bye"+t1.getName()+","+t1.getPriority());

		System.out.println("the livingness of t1 and t2"+t1.isAlive()+","+t2.isAlive());
	}

}
