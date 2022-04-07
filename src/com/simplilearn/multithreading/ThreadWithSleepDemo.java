package com.simplilearn.multithreading;

public class ThreadWithSleepDemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
			System.out.println("Thread t1 is working ...");
			// System.out.println(Thread.currentThread().getName()  +" =  "+ Thread.currentThread().getId());
		});
		
		Thread t2 = new Thread(()->{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread t2 is working ...");
			// System.out.println(Thread.currentThread().getName()  +"  =  "+ Thread.currentThread().getId());
		});
		
		Thread t3 = new Thread(()->{
			System.out.println("Thread t3 is working ...");
			// System.out.println(Thread.currentThread().getName()  +"  =  "+ Thread.currentThread().getId());
		});

		t1.start();
		t2.start();
		t3.start();
	}

}
