package com.syntax.class08;

public class ArrayOnIntegers {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */

		int[] numbers = new int[7];
		numbers[0] = 3;
		numbers[1] = 6;
		numbers[2] = 1;
		numbers[3] = 10;
		numbers[4] = 90;
		numbers[5] = 2;
		numbers[6] = 5;

		int i = 0;
		int largest = numbers[0];
		int sum = 0;
		for (i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			
		}
		System.out.println(sum);
	}
}