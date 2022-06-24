package com.bhagavan.interview.multithreading;

import java.util.LinkedList;
import java.util.List;

class Communicate
{
	int counter=0;
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity=5;
	boolean check=false;
	
	public synchronized void  produce() throws InterruptedException
	{
		while(check)
		{
		while(list.size()==capacity)
		{
			check=false;
			wait();
		}
		counter++;
		list.add(counter);
		System.out.println("Produced the value"+counter);
		notify();
		Thread.sleep(3000);
		}
	}
	
	public synchronized void  consume() throws InterruptedException
	{
		while(list.isEmpty())
		{
			wait();
		}
		
		Integer removeFirst = list.removeFirst();
		System.out.println("consumed the element "+removeFirst);
		notify();
		Thread.sleep(3000);
		
		
	}

}

public class ProducerConsumer {
	
	public static void main(String[] args) throws InterruptedException {
		Communicate  com = new Communicate();
		
		Thread t1 = new Thread(() -> {
			try {
				com.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		Thread t2 = new Thread(() -> {
			try {
				com.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
	
		
		t1.join();
		t2.join();
		
	}
	
	
	
	

}
