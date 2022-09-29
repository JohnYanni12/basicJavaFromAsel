package com.syntax.class08;

public class arrayEvenNum {

	public static void main(String[] args) {
		/*
		 * 4. Create a 2D array for integer type where you will store odd and even
		 * numbers. Develop a program which will identify/print the even numbers only.
		 */

		int[][] numbers = { { 23, 2, 100, 42, 90, 1, 7, 6 }, { 11, 3, 8, 10, 44, 66 } };
		for (int FirstNum[] : numbers) {
			for (int LastNum : FirstNum) {

				if (LastNum % 2 == 0) {

					System.out.println(LastNum);
				}

			}

		}

	}

}
