
package com.syntax.class05;

import java.util.Scanner;

public class Practis {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub1. 
		// Prompt the user to enter person heights in inches. Person should be
		// classified as one of the following:
//		• short (under 60 inch)
//		• medium(between 60 -72 inch)
//		• tall (over 72 inch)

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your heigh in inches: ");
		int heighInInches = scanner.nextInt();

		if (heighInInches < 60) {

			System.out.println("Short");
		} else if (heighInInches >= 60 && heighInInches < 72) {
			System.out.println("Medium");
		} else
			System.out.println("tall");

		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 */

		int day = 10;
		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday");
		} else if (day >= 6 && day <= 7) {
			System.out.println("It is a weekend");
		} else
			System.out.println("Invalid day");

		// 3. Ask user to enter a number and then define if number is small, medium or
		// large
//				Small number is value between 1 and 10
//				Medium number is value between 11 and 100
//				Large number is value between 101 and 1000

		System.out.println("Enter a number: ");
		int num = scanner.nextInt();

		if (num >= 1 && num <= 10) {
			System.out.println("Small number is value between 1 and 10");
		} else if (num > 10 && num <= 100) {
			System.out.println("Medium number is value between 11 and 100");

		} else if (num > 100 && num <= 1000) {
			System.out.println("Large number is value between 101 and 1000");
		} else 
			System.out.println("Please enter a valid number");

	}

}
