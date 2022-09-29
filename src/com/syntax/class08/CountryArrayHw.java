package com.syntax.class08;

import java.util.Scanner;

public class CountryArrayHw {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the array size: ");

		//int numberOfEl = 0;
		int numberOfEl = scanner.nextInt();
		

		String[] country = new String[numberOfEl];

		
		String space = scanner.nextLine();
		for (int i = 0; i < country.length; i++) {
			System.out.println("Enter the country name: ");
			System.out.print((i + 1) + ": ");

			country[i] = scanner.nextLine();
			if (country[i].equalsIgnoreCase("Usa")) {
				System.out.println("The capical of " + country[i] + " is Washington");
			}
			if (country[i].equalsIgnoreCase("Egypt")) {
				System.out.println("The capical of " + country[i] + " is Cairo");
			}
			if (country[i].equalsIgnoreCase("China")) {
				System.out.println("The capical of " + country[i] + " is Beijing");
			}
		}
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Enter the array size: ");

		int Num = 0;
		Num = scanner1.nextInt();

		String[] home = new String[Num + 1];

		System.out.println("Enter the country name: ");

		for (String home1 : home) {
			home1 = scanner1.nextLine();
			

			if (home1.equalsIgnoreCase("Usa")) {
				System.out.println("The capical of " + home1 + " is Washington");
			}
			if (home1.equalsIgnoreCase("Egypt")) {
				System.out.println("The capical of  " + home1 + " is Cairo");
			}
			if (home1.equalsIgnoreCase("China")) {
				System.out.println("The capical of " + home1 + " is Beijing");
			}
		}

	}

}
