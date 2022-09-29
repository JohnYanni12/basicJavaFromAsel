package com.syntax.class08;

public class ReverseOrder extends ArrayHw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] letters1 = { 'a', 'b', 'c', 'd', 'e', 'f' ,'g'};
		//int i;
		//int g = letters1.length;
		
		for (int i = letters1.length - 1 ; i >= 0; i--) {
			System.out.print(letters1[i] + " ");
			
		}

	}
}
