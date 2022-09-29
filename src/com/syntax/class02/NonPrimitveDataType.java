package com.syntax.class02;
//public class NonPrimitveDataType;

import java.util.Scanner;



	//private static boolean lol;

	public static void main(String [] Args) {
		int count = 5;
		

		boolean john = (true); 
			
		    //String hi = "john";		
		
		
			do {
	
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = scanner.next();
		
		
		System.out.print("What is your address? ");
		String address = scanner.next();
		
		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		
		System.out.println();
		
		//String address = "109 22nd st SW, Rochester, MN 55902.";	
		//int number = 484_378_2392;
	
		System.out.println("Your name: " + name);
		System.out.println("Your Address: " + address);
		System.out.println("Your age: " + age);
			count++;
			}
		while (count <=10);
		System.out.println("Good bye");
		
	}
	}

