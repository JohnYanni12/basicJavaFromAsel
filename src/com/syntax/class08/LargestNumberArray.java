package com.syntax.class08;

public class LargestNumberArray {

	public static void main(String[] args) {
		/*
		 * From an array of integer elements find the largest number.
		 * 
		 */

		int[] numbers = new int[7];
		numbers[0] = 3;
		numbers[1] = -6;
		numbers[2] = 1;
		numbers[3] = 10;
		numbers[4] = 90;
		numbers[5] = 2;
		numbers[6] = 5;

		int i;
		int largest = 0;

		for (i = 0; i < numbers.length; i++) {
			// 4. From an array of integer elements find the largest number.
			if (numbers[i] > largest) {

				largest = numbers[i];
			}
		}
		System.out.print(" Largest number is " + largest);

	}

}