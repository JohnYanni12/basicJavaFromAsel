package com.syntax.class02;

public class HomeWork02 {

	public static void main(String[] args) {
	
		double a = 2.76;
		double b = 7.12;
		
		System.out.println("The sum of " + a + " & " + b + " is equal to " + (a+b)+ ".");
		System.out.println("The subtraction of " + a + " & " + b + " is equal to " + (a-b)+ ".");
		System.out.println("The multiplcation of " + a + " & " + b + " is equal to " + (a*b)+ ".");
		System.out.println("The division of " + a + " & " + b + " is equal to " + (a/ b)+ ".");
		
		System.out.println();
		
		//Squareing a number. 
		double S = 3.9;
		double squareOfNumber = S*S;
		System.out.println("The square of " + S + " is " + Math.round (squareOfNumber) + ".");
		
		System.out.println();
		
		int w, h;
		w= 5;
		h= 8;
		
		int area = w * h;
		int Perimeter = 2 * (w*h);
		
		System.out.println ("The perimeter of a rectangle with width " + w + " and height " + h +
				" is equal to " + Perimeter	+ " and the area is "  + area + ".");
		
		
	}

}
