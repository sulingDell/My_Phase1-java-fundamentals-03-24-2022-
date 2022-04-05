package com.simplilearn.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<String> bankQueue = new PriorityQueue<String>();

		// add elements in queue
		bankQueue.add("John");
		bankQueue.add("Mike");
		bankQueue.add("William");
		bankQueue.add("David");
		bankQueue.add("John");
		bankQueue.add("Carl");
		bankQueue.add("Aria");

		System.out.println(bankQueue);

		// peek -> checking top or high priority element
		System.out.println("Head : > " + bankQueue.peek());
		System.out.println("Head : > " + bankQueue.element());

		// remove element from head
		String removedElem = bankQueue.poll();
		System.out.println("Removed elem :> " + removedElem);
		
		System.out.println("---------------");
		// iteration over
		for (String person : bankQueue) {
			System.out.println(person);
		}

	}

}
