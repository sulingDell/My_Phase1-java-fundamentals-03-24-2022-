package com.simplilearn.multithreading;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		
		// create a thread
		ThreadDemo mainthread = new ThreadDemo();
		
		// start a thread
		mainthread.start();
	}

	@Override
	public void run() {
		// thread processing logic
		System.out.println("The main thread is running !");
	}
}
