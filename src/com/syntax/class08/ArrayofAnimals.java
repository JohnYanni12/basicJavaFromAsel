package com.syntax.class08;

public class ArrayofAnimals {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it. Using 2 different
		 * loops print all elements from the array.
		 */

		String[] animals = new String[5];
		animals[0] = "caw";
		animals[1] = "dog";
		animals[2] = "cat";
		animals[3] = "fish";
		animals[4] = "bear";
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();

		String[] animals1 = { "caw", "dog", "cat", "fish", "bear"};

		for (String animals2  : animals1) {
			System.out.print(animals2 + " ");
		}
	}
}
