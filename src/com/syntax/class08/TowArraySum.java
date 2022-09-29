package com.syntax.class08;

public class TowArraySum extends ArrayHw01 {

	public static void main(String[] args) {
		// 3. Create a 2D array of integer values. Print the sum of
		// all numbers.

		int[][] num = { { 1, 4, 3, 2, 54, 8 }, { 41, 80, 7, 12, 23 } };
		int sum = 0;
		int i = 0;

		for (int[] FArray : num) {
			for (int SArray : FArray) {

				sum += SArray;
			}
		}
		System.out.println(sum);
	}
}