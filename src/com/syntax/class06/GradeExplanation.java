package com.syntax.class06;

import java.util.Scanner;

public class GradeExplanation {

	public static void main(String[] args) {
		/*
		 * 1. Allow user to enter grade (A, B, or C etc...) and then provide
		 * explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not
		 * Acceptable. At the end your program should print which grade was entered by a
		 * user with explanation.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your grade: ");
		String grade = scanner.nextLine();

		String explanation = null;

		switch (grade) {

		case "A":
			explanation = "Excellent";
			break;

		case "B":
			explanation = "Good";
			break;

		case "C":
			explanation = "Average";
			break;

		case "D":
			explanation = "bad";
			break;

		default:
			explanation = "Not Acceptable";

		}
		System.out.println("Your grade is " + grade + ", and it is " + explanation + ".");
	}

}
