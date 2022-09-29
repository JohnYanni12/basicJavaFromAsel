package com.syntax.class08;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		/*Write a program to swap 2 numbers without a temporary variable?*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the firs number: ");
		int firstNum = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		int secondNum = scanner.nextInt();
	
		
		System.out.println("Numbers before swaping");
		System.out.println("first number is "+ firstNum);
		System.out.println("first number is "+ secondNum );
		
		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = secondNum - firstNum;
		
		System.out.println();
		System.out.println("Numbers after swaping");
		
		if (firstNum < 0) {
		firstNum = (firstNum * -1 );
		}
				
		System.out.println("first number is "+ firstNum);
		
		if (secondNum < 0) {
			secondNum = (secondNum * -1 );
			}
		
		System.out.println("first number is "+ secondNum );
	}

}
