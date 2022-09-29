package com.syntax.class06;

import java.util.Scanner;

public class averageGrade {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores)
		 * and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter quiz scores: ");
		int quiz = scanner.nextInt();
		
		System.out.println("Please enter mid term scores: ");
		int midTerm = scanner.nextInt();
		
		System.out.println("Please enter final scores: ");
		int finalScores = scanner.nextInt();
		
		int average = (quiz + midTerm + finalScores)/3;
		String grade = null;
		
		if (average > 0) {
			
			if (average >= 90 && average <= 100){
			grade = "A";
			}
			else if (average >= 70 && average < 90){
			grade = "B";
			}
			else if (average >= 50 && average < 70){
			grade = "C";
			}
			else 
			grade = "F";
		
		System.out.println("Your average score is "+ average +", your grade is "+ grade);
		}
		else {
			
			System.out.println("Enter a valid number, please.");
			grade = "None";
		}
			
			
			
		}
	}


