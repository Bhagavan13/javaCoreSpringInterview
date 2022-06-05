package com.bhagavan.interview.multithreading;
class Hi1 {
	public void show() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hi" + i);
			try {
				Thread.sleep(1000); // Taking 5 seconds individually for example
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Hello1 {
	public void show() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello" + i); // Taking 5 seconds individually for example
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class WithoutThreads {

	public static void main(String[] args) {

		long t1 = System.currentTimeMillis();
		Hi1 obj1 = new Hi1();
		Hello1 obj2 = new Hello1();
		obj1.show();
		obj2.show();
		long t2 = System.currentTimeMillis();

		System.out.println("The time took is with out using threads " + ((t2 - t1) / 1000));

	}

}
