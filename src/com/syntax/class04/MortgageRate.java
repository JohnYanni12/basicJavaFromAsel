package com.syntax.class04;
import java.util.Scanner;

public class MortgageRate {

	public static void main(String[] args) {
		/*Create a Java program and store values of mortgage rate and mortgage price.
First, program should check if rate is higher than 4.5 user will not buy
a house, otherwise user will consider buying. Once user decides to buy a house,
if price of the house is larger than 200000 than user will take a loan,
otherwise user will pay cash */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the current mortgage rate: ");
		double mortgageRate = scanner.nextDouble();
		
		if (mortgageRate > 4.5) {
			System.out.print("Sorry you can not buy a house");
		
		}
		else
		{
			System.out.println("You can buy a house");
			System.out.println(" ");
			
		System.out.print("Please enter the current mortgage price: ");
		
		int mortgagePrice = scanner.nextInt();
		
		if (mortgagePrice > 200000) {
			System.out.print("You can take a loan");
		}
		else
			System.out.print("You don't need a loan, you can buy it cash");
	}
	}
}
