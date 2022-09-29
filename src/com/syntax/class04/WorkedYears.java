package com.syntax.class04;

import java.util.Scanner;

public class WorkedYears {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter numbers of worked year: ");
		int WorkedYears = scanner.nextInt();

		System.out.print("Enter the annual salary: ");
		int annualSalary = scanner.nextInt();

		if (WorkedYears >= 5) {
			System.out.println("You are eligible for the bonus; ");

			if (annualSalary > 50000) {
				System.out.println("bonus is 5000");
			}

			else

				System.out.println("bonus is 3000");
		}

		else

			System.out.println("You are NOT eligible for the bonus");

	}
}
