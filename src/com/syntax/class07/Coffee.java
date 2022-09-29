package com.syntax.class07;

import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {
		/*
		 * 6. Declare a variable to store a price for a coffee. Ask the user to pay for
		 * a coffee. Keep asking to pay for coffee until the user enters the EXACT
		 * amount . If the user gives more than coffee price --> ask them to give less,
		 * if the user gives less money then ask to give more. Once user give EXACT
		 * amount print “Please enjoy your coffee
		 */
//
//		double coffee = 4.65;
//		double pay;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please pay your order: ");
//
//		do {
//			pay = sc.nextDouble();
//
//			if (pay > coffee) {
//				System.out.print("Please give less: ");
//			}
//
//			else if (pay < coffee) {
//				System.out.print("Please give more:  ");
//
//			} else
//				System.out.println("Enjoy your coffee.");
//
//		} while (coffee != pay);
		/*
		 * 
		 * int range = finalValue - initial;
		 * 
		 * int x = 0
		 * 
		 * for (int i = initial; i <= finalValue; i++) { if (i%2==0) { int x = x+i;
		 * 
		 * } } System.out.printf(x);
		 * 
		 */
//		int start= 1;
//		int last =50;
//		int y= 0;
//		//int y = last - start;
//		
//		for (int i = 0; i <= last; i++) {
//			if(i %2==0) {
//				y= y+=i;
//			}
//		}
//			System.out.println(y);
//			
//			int start1= 1;
//			int last1 =50;
//			int s= 0;
//			
//			for (int i = 0; i <= last1; i++) {
//				if(i %2==1) {
//					s= s+=i;
//				}
//			}
//				System.out.println(s);
//				
		double snumber = 5;
		double gNumber;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter my secret number: ");
		gNumber = sc.nextDouble();
		do {

			System.out.print("Not Right, try again: ");
			gNumber = sc.nextDouble();

		}

		while (gNumber != snumber);
		System.out.println("!!!! Thats right !!!!");

//int numE = 0;
//int numO = 0;
//
//for (int b= 0; b<=50; b++) {
//	
//	if(b%2==0) {
//		numE +=b;
//	}
//		else 
//				numO +=b;
//		}
//	System.out.println(numE  + " ,, "+numO );
//	

	}

}