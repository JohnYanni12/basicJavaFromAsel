package com.syntax.class04;
import java.util.Scanner;
public class Loan {

	public static void main(String[] args) {
		/*You are a loan specialist and you need to ask user what is the amount
		 * of loan is needed. If loan is less or equal to
		 * 200,000 then you would lend the money otherwise
		 * you would reject the client.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money is needed? ");
		int money = scanner.nextInt();
 
		if (money < 200000) {
			
			System.out.println("Congratulations, the bank approved your reqest for a loan! ");
			
		}
		else
			System.out.println("Sorry, the bank rejected your reqest for a loan!! ");
	}
}
