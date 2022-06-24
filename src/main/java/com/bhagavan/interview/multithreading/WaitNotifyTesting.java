package com.bhagavan.interview.multithreading;

class Banking {
	Integer amount = 1000;
	synchronized void withdraw(Integer withdrawAmount) throws InterruptedException {
		if (amount < withdrawAmount) {
			
			System.out.println("requested balance is " + withdrawAmount + " amount in the account is only" + amount);
			System.out.println("So Less balance; waiting for deposit...");
			wait();
			Thread.sleep(5000);
		}
		amount = amount - withdrawAmount;
		System.out.println("amount has withdrawn successfully and balance left " + amount);
	}
	synchronized void deposit(Integer depositedAmount) {
		amount = amount + depositedAmount;
		System.out.println("amount deposited " + depositedAmount + " completed and total is " + amount);
		notify();
	}
}
public class WaitNotifyTesting {

	public static void main(String[] args) {
		Banking banking = new Banking();
		Banking banking1 = new Banking();

		Thread t1 = new Thread(() -> {
			try {
				banking.withdraw(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(() -> {
			banking.deposit(1000);
		});
		t1.start();
		t2.start();
	}
}
