package com.syntax.class04;

import java.util.Scanner;

public class NestedIfConditions {

	public static void main(String[] args) {
		int count = 0;
		do {
			count++;
			Scanner lol = new Scanner(System.in);

			System.out.print(count + "- What is the season? ");
			String season = lol.nextLine();

			System.out.print("What is maxmum spending plan? ");
			int myMoney = lol.nextInt();

			// int cost = 600;
			// String season = "spring";

			if (season.equals("winter")) {
				System.out.println("let's play indoor");

				if (myMoney >= 500) {
					System.out.println("let's go to MOA...");
				}

				else {
					System.out.println("let's get a movie...");
				}

			}

			if (season.equals("spring"))
				;
			{
				System.out.println("let's play outdoor");

				if (myMoney >= 800) {
					System.out.println("Disneyland");
				}

				else if (myMoney >= 500) {
					System.out.println("Wisconsin Dells");
				}

				else if (myMoney >= 300) {
					System.out.println("lets eat outside");
				}

				else
					System.out.println("lets stay in the backyeard");
			}
			System.out.println();
		}

		while (count <= 5);
	}

}
