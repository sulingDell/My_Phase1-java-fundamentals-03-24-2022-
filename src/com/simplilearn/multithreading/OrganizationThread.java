package com.simplilearn.multithreading;

public class OrganizationThread {

	public static void main(String[] args) {

		// create a john thread
		John t1 = new John();
		t1.start();

		// create a mike thread
		Mike t2 = new Mike();
		t2.start();

		// create a sam thread
		Sam t3 = new Sam();
		t3.start();
	}
}

class WorkStatus {
	
	public String status = "Inprogress";

	public String updateStatus(String status) {
		return this.status = status;
	}
}

// Thread Example by extending Thread class
class John extends Thread {

	@Override
	public void run() {
		// thread processing logic
		System.out.println("-- John Thread is running ---");
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			count++;
		}
		System.out.println("Count : " + count);
	}
}

class Mike extends Thread {

	@Override
	public void run() {
		// thread processing logic
		System.out.println("-- Mike Thread is running ---");
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			count++;
		}
		System.out.println("Count : " + count);
	}
}

class Sam extends Thread {

	@Override
	public void run() {
		// thread processing logic
		System.out.println("-- Sam Thread is running ---");
	}
}