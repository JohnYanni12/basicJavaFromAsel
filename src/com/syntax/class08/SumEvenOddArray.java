package com.syntax.class08;

import java.util.Scanner;

public class SumEvenOddArray {

	public static void main(String[] args) {
		/*
		 * 5. Create a 2D array of integers. Develop a program which will calculate the
		 * sum of even and odd numbers for that array.
		 */

		int[][] numbers = { { 2, 5, 70, 86, 53, 9, 65, 4, 12 }, { 10, 8, 2, 4, 68, 17, 16 } };
		int sum = 0;
		int sum1 = 0;
		for (int num[] : numbers) {
			for (int lastnum : num) {

				if (lastnum % 2 == 0) {
					sum += lastnum;
				}

				if (lastnum % 2 == 1) {
					sum1 += lastnum;
				}
			}
		}
		System.out.println("THe sum of the even numbers is: " + sum);
		System.out.println("THe sum of the odd numbers is: " + sum1);

//		char[] letters = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };
//
//		for (char lett:letters) {
//			
//			System.out.print(lett[0] + lett[1] + lett[4] + lett[6] + lett[8] + lett[10]);
//		}
		
	       
		int i;
	        String [] input = new String [7];
	            for (i = 0; i<input.length; i++){
	                
	        Scanner scanner = new Scanner(System.in);
	        System.out.print( "Please enter day " + (i + 1) + " of the week: " );
	                input[i] = scanner.nextLine();
	            }
	                System.out.print (input [i]+ " "); 
	System.out.println ();
	}

	private static String input(int i) {
		// TODO Auto-generated method stub
		return null;
	}   
	}
	    
	

