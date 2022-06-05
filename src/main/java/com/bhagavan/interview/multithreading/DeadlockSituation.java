package com.bhagavan.interview.multithreading;

public class DeadlockSituation {

	public static void main(String args[]) {
		final String abc = "surya";
		final String dev = "bhagavn";
		Thread t1 = new Thread(() -> {
			synchronized (dev) {
				System.out.println("thread t1 locked the abc");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (abc) {
					System.out.println("thread t1 waiting for dev but acquired by thread t2");
				}

			}

		});

		Thread t2 = new Thread(() -> {
			synchronized (abc) {
				System.out.println("thread t2 locked the dev which t1 wants");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				synchronized (dev) {
					System.out.println("thread t2 waiting for abc but acquired by thread t1");
				}
			}
		});

		t1.start();
		t2.start();
	}

}
