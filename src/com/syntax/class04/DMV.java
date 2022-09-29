package com.syntax.class04;
import java.util.Scanner;
public class DMV {

	public static void main(String[] args) {
		/*You are DMV representative and you need to ask customer their age.
		 * If they are 18 and older you will issue a
		 *  driver licence to them, otherwise you will offer them to
		 *  get a learners permit.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How old are you? ");
		int age = scanner.nextInt();

if (age >= 18) {
			
			System.out.println("You will get a driver license!");
			
		}
		else
			System.out.println("Yo will get a learners permit ");
	}

}
