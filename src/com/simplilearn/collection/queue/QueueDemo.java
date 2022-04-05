package com.simplilearn.collection.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		// Queue is a data structure which works in first in first out order.
		Queue<String> peopleQueue = new ArrayDeque<String>();

		// add elements
		peopleQueue.add("John");
		peopleQueue.add("Mike");
		peopleQueue.add("Will");
		peopleQueue.add("David");
		peopleQueue.add("John");
		peopleQueue.add("Kim");
		peopleQueue.add("Marry");

		System.out.println(peopleQueue);

		// peek -> checking top element
		System.out.println("Head :> " + peopleQueue.peek());
		System.out.println("Head :> " + peopleQueue.element());

		// remove elements from head
		String removeElem = peopleQueue.poll();
		System.out.println("Removed elem :> " + removeElem);

		// peek -> checking top element
		System.out.println("Head :> " + peopleQueue.peek());
		System.out.println("Head :> " + peopleQueue.element());
		System.out.println(peopleQueue);
		
		System.out.println("---------");
		Iterator<String> itr = peopleQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------");
		// iteration over
		for (String person : peopleQueue) {
			System.out.println(person);
		}
	}

}
