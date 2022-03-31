package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// arrays syntax
		int[] numbers = new int[5];

		// add values in numbers array
		numbers[0] = 10;
		numbers[1] = -20;
		numbers[2] = 30;
		numbers[3] = -40;
		numbers[4] = 50;
		// numbers[5] =60; // ArrayIndexOutOfBoundsException

		// print all array element
		System.out.println(Arrays.toString(numbers));

		// print one array element
		System.out.println("Index 2 element : " + numbers[2]);
		System.out.println("Index 3 element : " + numbers[3]);
		// System.out.println("Index 5 element : " +numbers[5]); //
		// ArrayIndexOutOfBoundsException

		System.out.println("-----------");
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("Index " + index + " element : " + numbers[index]);
		}

		System.out.println("-----------");
		float amount[] = new float[10];

		// for for adding elements in an array
		for (int index = 0; index < amount.length; index++) {
			amount[index] = 10 * index + 1;
		}

		// print all array element
		System.out.println(Arrays.toString(amount));
	}

}
