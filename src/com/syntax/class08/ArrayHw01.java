package com.syntax.class08;

public class ArrayHw01 {

	public static void main(String[] args) {
		/*W. 1. Create an array of cars and store 6 elements into it.
		 * Using 2 different loops print all values from the array.
*/

		String []cars = new String [6];
		cars [0]= "Mitsubishi";
		cars [1]= "Mazda";
		cars [2]= "BMW";
		cars [3]= "Porsche";
		cars [4]= "Ford";
		cars [5]= "Mercedes ";
		
		for (int i = 0; i<cars.length; i++)
		System.out.print(cars [i] + " ");
		
		System.out.println();
		
		String [] cars1 = {"Mitsubishi", "Mazda", "BMW", "Porsche", "Ford", "Mercedes"};
		
	
		for (String car:cars1) {
			System.out.print(car + " ");
		}
	}

}
