package com.syntax.class07;

import java.util.Scanner;

public class AskThreeTimes {

	public static void main(String[] args) {
		// 5. Prompt the user to ask the name 3 times and print "Good afternoon +name...

		Scanner sc = new Scanner(System.in);
		String answer;
		int num = 1;

		while (num <= 3) {
			System.out.print("What is your name? ");
			answer = sc.nextLine();

			num++;
			System.out.println("Good afternoon " + answer);
			System.out.println();
		}

	}

}
