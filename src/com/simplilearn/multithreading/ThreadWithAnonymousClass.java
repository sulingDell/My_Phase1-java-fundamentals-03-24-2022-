package com.simplilearn.multithreading;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1 is running ...");
			}
		});
		
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2 is running ...");
			}
		});
		
		t2.start();
	}

}
