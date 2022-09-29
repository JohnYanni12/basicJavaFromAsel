package com.syntax.class06;

import java.util.Scanner;

public class IfCalculator {

	public static void main(String[] args) {
		/*
		 * 3. : Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter two numbers ");
		System.out.print("First number: ");
		double number1 = scanner.nextDouble();

		System.out.print("Second number: ");
		double number2 = scanner.nextDouble();

		System.out.print("Please enter the desired operator (+,-,*,/): ");
		String operator = scanner.next();
		double result = 0.0;
		boolean wrongOperater = false;
		if (operator.equals("+")) {
			result = number1 + number2;

		} else if (operator.equals("-")) {
			result = number1 - number2;

		} else if (operator.equals("*")) {
			result = number1 * number2;

		} else if (operator.equals("/")) {
			result = number1 / number2;
		}
		else {
			wrongOperater = true;
			System.out.println("Enter valid operator");

		}
		if (!wrongOperater) {
		System.out.println("Result of " + number1 + " " + operator + " " + number2 + " is " + result);
		System.out.println("The rounding number of " + result + " is " + Math.round(result));
	}
	}
}