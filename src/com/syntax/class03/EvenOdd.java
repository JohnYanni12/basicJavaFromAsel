package com.syntax.class03;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// Interview Question
		//Write a Java Program to check whether number is Even or Odd.*/
		
		int num = 7;
		
		if (num % 2 == 0 ) {
			
			System.out.println("Number " + num + " is an even number."); 

		}
		else 
			System.out.println("Number " + num + " is an odd number.");

		
		Scanner scanner = new Scanner (System.in);
		int num1 = 0;
		
		
		
		int count = 0;
		
	
		do
		{
			count++;
		System.out.print(count + "- What is the Number? ");
		int num11 = scanner.nextInt();
		
		if (num11 % 3 == 0 && num11 % 5 == 0)
		{			
			System.out.println("ZeeZoo");
			System.out.println("");
		}
		
		else if (num11 % 3 == 0 ) {
			System.out.println("Zoo");
			System.out.println("");
		}
		
		else if (num11 % 5 == 0 )
		{
		System.out.println("Zee");
		System.out.println("");
		}
		
		else
		{
			System.out.println("Number is not valid");
			System.out.println("");
		}
		
		}
		while (count < 5);
		
	}
}
