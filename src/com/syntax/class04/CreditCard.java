package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */
		boolean creditCard = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Do you have a credit card or not? Yes or No ");
		String answer = scanner.nextLine();

		if (answer.equals("No") || answer.equals("no")) {
			System.out.print("We can help you get on, are you interested? ");
		}

		else

			System.out.print("What is balance on the card? ");
		int balance = scanner.nextInt();

		if (balance > 1000) {
			System.out.print("You need to pay off immediately");
		}

		else
			System.out.println("You can spend more");
	}
}
