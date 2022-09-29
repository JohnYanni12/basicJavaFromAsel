package com.syntax.class06;

import java.util.Scanner;

public class CuntryLanguage {

	public static void main(String[] args) {
		/*
		 * 1. Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your country: ");
		String country = scanner.nextLine();
		
		//if(country.equalsIgnoreCase("Yes")) {
			
		//	System.out.println("Hi there");
		//}

		String language = null;

		switch (country) {
		case "usa":

			language = "English";
			break;
		case "Egypt":

			language = "Arabic";
			break;

		case "Frince":

			language = "Frinsh";
			break;

		case "China":

			language = "Mandarin";
			break;

		case "Brazil":

			language = "Portuguese";
			break;

		default: 
			language = "invalid";

		}
			System.out.print("Your Spoking language is " + language);
		
	}
}
