package com.simplilearn.multithreading;

class Counter {

	int count;

	// increase count
	public synchronized void increaseCount() {
		count++; // count = count +1 or count+=1;
	}

	// decrease count
	public synchronized void descreaseCount() {
		count--; // count = count -1 or count-=1;
	}
}

public class ThredSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		// create a counter object
		Counter counter = new Counter();

		// create a thread
		Thread t1 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		// create a thread
		Thread t2 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		// create a thread
		Thread t3 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("The count : " + counter.count);
	}

}
