package com.syntax.class03;

import java.util.Scanner;

public class StringType {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String Name = scanner.nextLine();
		
		System.out.print("What is your home number? ");
		int homeNumber = scanner.nextInt();
		
		System.out.print("What is the street name? ");
		String streetName = scanner.nextLine();
		
		System.out.print("What is your city? ");
		String city = scanner.nextLine();
		
		System.out.print("What is your state? ");
		String state = scanner.nextLine();
		
		System.out.print("What is your country? ");
		String country= scanner.nextLine();
		
		System.out.print("What is the Zib code? ");
		String zib= scanner.nextLine();
		
		System.out.println(Name +" lives at: "+ " "+ streetName + " "+city +" "+ state
				+ " "+ country + " "+ zib);
	
	}

}
