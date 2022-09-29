package com.syntax.class07;

public class LoopOodNumbers {

	public static void main(String[] args) {
		// 4. Print odd numbers between 20 and 50 (2 ways)
		
		
		int num = 21;
		
		while (num <= 50) {
		System.out.print(num + " ");
		num+=2;
		}
		System.out.println();		
		System.out.println();
		
		int num1 = 20;
		
		while(num1 <=50) {
			if(num1 %2==1) {
				System.out.print(num1 + " ");
		}
			num1++;
		}
		
	}

}
