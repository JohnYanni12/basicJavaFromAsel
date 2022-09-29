package com.syntax.class04;
import java.util.Scanner;
public class NestedIfCon2 {

	public static void main(String[] args) {
		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output
		 * should say “You are eligible for scholarship”, otherwise →
		 * “You should have studied harder” .
		 */

		boolean diploma;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have a diploma? yes or no:  ");
		String answer = scanner.nextLine();
		//diploma = scanner.nextBoolean();
		
		if (answer.equals("yes") || answer.equals("Yes")) {
			
			System.out.println("!!!congratulations!!!");
			//diploma = scanner.nextBoolean();
			
			System.out.println("What is your GED score? ");
			double gpaScore = scanner.nextDouble();
			
			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for scholarship");
			}
			else
				System.out.println("You should have studied harder");
			
		}
		else if (answer.equals("no") || answer.equals("No" )) {
			System.out.println("Just a suggesttion, you should get a degree!");
	}
	}
}
