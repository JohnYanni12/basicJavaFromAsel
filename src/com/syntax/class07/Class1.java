package com.syntax.class07;

public class Class1 {

	public static void main(String[] args) {

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int numA = 0;
		int j = 0;
		int i = 0;
		for (i = 0; i < a.length; i++) {

			for (j = 0; j <a.length; j++) {

				if (a[i][j] < 0) {
					numA = a[i][j] * -1;
//				System.out.print(numA + "  ");
				}
				if (a[i][j] >= 0 && numA % 2 == 1) {
					int num1 = a[i][j];
					
					// System.out.print(num1+ " ");
					
					System.out.print(numA + " ");
				}
				
			}
			
		}
		
	}
}
