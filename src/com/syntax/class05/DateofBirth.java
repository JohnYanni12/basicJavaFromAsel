package com.syntax.class05;

import java.util.Scanner;

public class DateofBirth {

	public static void main(String[] args) {
		/*
		 * 2. Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =”Spring” if user is born in June, July, August → season =”Summer” etc
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the month of birth: ");
		String month = scanner.nextLine();
		String season = null;

		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			season = "Winter";
		}

		else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		}

		else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		}

		else if (month.equals("Septrmber") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		}
		System.out.println("Your were born in "+ season);
		
	}
}
