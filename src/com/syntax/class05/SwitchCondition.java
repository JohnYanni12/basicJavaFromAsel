package com.syntax.class05;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//boolean house = true;
		// int day = 5;

		// int rent = 3000;
		int count = 0;

		do {
			count++;
			
			System.out.print("What is the day today? ");

			int day = scanner.nextInt();

			switch (day) {

			case 1:
				System.out.println("House is great");
				System.out.println("");
				break;

			case 2:
				System.out.println("I like it, but House needs work");
				System.out.println("");
				break;
			default:
				System.out.println("I don not like it!!!");
				System.out.println("");

			}
		} while (count <= 5);

	}
}
