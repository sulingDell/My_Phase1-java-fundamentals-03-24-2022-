package com.simplilearn.multithreading;

public class CompanyThread {
	
	public static void main(String[] args) {
		
		// create a bob object
		Bob bob = new Bob();  // this is not a thread object
		// create a thread class object
		Thread t1 = new Thread(bob);  //  Using the constructor Thread(Runnable r) 
		t1.start();
		// t1.start(); // IllegalThreadStateException
		// t1.run();   // t1.run() will be invoke by main method.
		
		
		Thread t2 = new Thread(new Will());
		t2.start();
		
	}
}


class Work {
	
	public String status = "Inprogress";

	public String updateStatus(String status) {
		return this.status = status;
	}
}

// Thread creation by implementing Runnable interface
class Bob extends Work implements Runnable {

	@Override
	public void run() {
		// thread processing logic
		System.out.println("-- Bob Thread is running ---");
	}
}


class Will implements Runnable {

	@Override
	public void run() {
		// thread processing logic
		System.out.println("-- Will Thread is running ---");
	}
}