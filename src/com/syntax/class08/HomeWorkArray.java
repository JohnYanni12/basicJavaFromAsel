package com.syntax.class08;

import java.util.Scanner;

public class HomeWorkArray {

	public static void main(String[] args) {
		/*
		 * 1. Using Scanner create an array of integer values. After the array is
		 * created, calculate the sum of all stored elements in that array.
		 */

		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int sum1 = 0;
		
		
		
		System.out.print("please enter a number: ");
		int NumberOfEl = scanner.nextInt();
		String dommy = scanner.nextLine();
		
		String []words = new String [NumberOfEl];
		System.out.println("Enter in "+NumberOfEl+ " words: ");

			for (i = 0; i < words.length ; i++) {
				System.out.println("word "+ (i+ 1 )+ ": ");	
				
		words[i]= scanner.nextLine();
		
		
		}
			System.out.println("words are "); 
		for (i = 0; i < words.length ; i++){
				
			
		
		System.out.print(words[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		
//		int[] num = new int[8];
//		
//		System.out.print("Please pay your order: ");
//
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//			sum += num[i];
//			
//		}
//		System.out.print("The sum is: " + sum);
}

}
