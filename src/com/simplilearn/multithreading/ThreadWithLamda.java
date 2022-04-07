package com.simplilearn.multithreading;

public class ThreadWithLamda {

	public static void main(String[] args) {
		
		Thread t1 = new Thread( ()-> {
				System.out.println("Thread 1 is running ...");
		});
		
		t1.start();
		
		Thread t2 = new Thread( ()-> {
				System.out.println("Thread 2 is running ...");
		});
		
		t2.start();
		
		Thread t3 = new Thread( ()-> {
			System.out.println("Thread 3 is running ...");
		});
		t3.start();
	}

}
