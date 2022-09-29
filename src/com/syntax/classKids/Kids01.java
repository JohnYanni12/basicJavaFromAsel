package com.syntax.classKids;

import java.util.Scanner;

public class Kids01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean x = true;

		// System.out.print("enter a number: ");
		// int n = scanner.nextInt();
//int i , j, n;
//n = scanner.nextInt();
//		for (i=1; i <= n ; i++) {
//			for (j = 1; j <= i; j++)
//			
//System.out.print(i);
//	
//System.out.println("");
//		}
		/*
		 * Time Table Write a program that prompts the user to input a positive integer.
		 * It should then print the multiplication table of that number.
		 */
//		int n = scanner.nextInt();
//		int i= 0;
//		for (i = 1; i<=12; i++) {
//			//for (n = 0; i<= n; n++);
//			int timeTable = i * n ;
//			System.out.println(i +" X "+ n +" = "+timeTable);
//		}

		/*
		 * Power numbers Two numbers are entered through the keyboard. Write a program
		 * to find the value of one number raised to the power of another. (Do not use
		 * Java built-in method)
		 */
//		System.out.print("enter first number: ");
//		int n1 = scanner.nextInt();
//
//		System.out.print("enter second number: ");
//		int n2 = scanner.nextInt();
//		int result = 1;
//		// int num1 = n1=n2;
//		// System.out.println(num1);
//		for (int i = 1; i <= n2; i++) {
//		result *= n1;
//		}
//		System.out.println(result);
//		
		/*
		 * Write a program that prompts the user to input an integer and then outputs
		 * the number with the digits reversed. For example, if the input is 12345, the
		 * output should be 54321.
		 * 
		 * System.out.print("enter a number: "); int n1 = scanner.nextInt();
		 * 
		 * for (int i = 0; i<= n1 ; i++) { System.out.print(i); } System.out.println();
		 * for (int j = n1; j>= 0 ; j--) {
		 * 
		 * System.out.print(j); } //System.out.print(j);
		 */
		// Write a program that reads a set of integers, and then prints the sum of the
		// even and odd integers.

//		int tEven = 0, i = 0;
//		int tOdd = 0;
//		for (i = 0; i <= 50; i++) {
//			if (i % 2 == 0) {
//				tEven += i;
//			}
//
//		}
//		System.out.println(tEven);
//		for (i = 0; i <= 50; i++) {
//			if (i % 2 == 1) {
//				tOdd += i;
//			}
//		}
//		System.out.println(tOdd);
		/*
		 * Write a do-while loop that asks the user to enter two numbers.
		 * The numbers should be added and the sum displayed. The loop should
		 * ask the user whether he or she wishes to perform the operation again.
		 * If so, the loop should repeat; otherwise it should terminate. 
		 */
		boolean yes = true;
		boolean no;
		int ii = 0;
		String answer = null;
		
		do {
		
		System.out.print("Enter 1st number: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int n2 = scanner.nextInt();
		
		int sum = n1+n2;
		System.out.println(sum);
		
		System.out.println("Do wishes to perform the operation again: ");
		answer = scanner.next();
		
		if (answer.equalsIgnoreCase("yes")) {
		ii++;
		}
		}
		while (answer.equalsIgnoreCase("yes"));
	
	if (answer.equalsIgnoreCase("no") || !answer.equalsIgnoreCase("Yes")) {
		
	System.out.println("Happy to help, good bye!!! ");
	
		}
	}
		
		
		
	

		
		}

		
	
