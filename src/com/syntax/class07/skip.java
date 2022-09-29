package com.syntax.class07;

import java.util.Scanner;

import com.syntax.classKids.Student1;

public class skip {

	public static void main(String[] args) {
		String name;
	    String id;
	    double weight;
	    char gender;
	    int age;
	    
		 Student1 Dts = new Student1();
	        Dts.name = "John";
	        Dts.id = "484873-99e8w";
	        Dts.gender= 'M';

	        Dts.study();
	        Dts.eat();
	        System.out.print("Student name is: "+ Dts.name+ " Gender: " +Dts.gender);
	    }
		// TODO Auto-generated method stub
//		for (int i = 1; i <= 50; i++) {
//
//			if (i % 3 == 0) {
//				continue;
//			}
//			System.out.print(i + "  ");
//
//		}
//		System.out.println();

		/*
		 * Task 2: Write a program to ask a user to enter item they want to buy and the
		 * price of that item. Every time user enters money, accumulate the amount and
		 * tell the user how much is left to pay off. If user give more money program
		 * should return a change. Whenever user done with payments program should say
		 * "Thank you for shopping!"
		 */

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter what do you want to buy: ");
//		String item = sc.nextLine();
//
//		System.out.print("how much is it? ");
//		double price = sc.nextDouble();
//
//		System.out.print("please pay now: ");
//		double pay = sc.nextDouble();
//
//		
//		double lastpay= 0;
//		double change = 0;
//		while (lastpay != price) 
//		{
//			lastpay += pay ;
//		if (lastpay < price) {
//			double need= price - lastpay; 
//			System.out.print("pay more the left is : " + need);
//			pay = sc.nextDouble();
//		}
//		else if (lastpay > price) {
//			change = lastpay-price; 
//			System.out.print("pay more the left is : " + change);
//			break;
//			
//		//System.out.print(lastpay);
//		
//			
//		}
//		
//	}
//		System.out.print("thank you ");

		Scanner sca = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sca.nextInt();
		for (int i = 0; i <= num; i++) {

			// System.out.print(i);
		}
		int num1 = num * 2;

		// System.out.print(num1);

		for (int j = 0; j < num1; j++) {

			System.out.print(j);
		}
	}

}
