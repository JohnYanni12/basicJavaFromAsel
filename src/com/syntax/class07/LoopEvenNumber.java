package com.syntax.class07;

public class LoopEvenNumber {

	public static void main(String[] args) {
		// 3. Print even numbers from 20 to 1 (2 ways)
		
		
//int num = 20;
//		
//		while (num >= 1) {
//		System.out.print(num + " ");
//		num-=2;
//		}
//		
//	System.out.println();		
//	System.out.println();
//	
//	
//	
//int num1 = 20;
//	
//	while (num1 >= 1) {
//		
//		if (num1 % 2==0) {
//		System.out.print(num1 + " ");
//		}
//		num1--;
//		
//		}
		
//		for (int x = 20; x>=1; x-=2) {
//		System.out.print(x+ "  ");
//		System.out.print("");
		//}
		
		
		
		
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
			 for(int i=0; i< a.length; i++){
	             for(int j=0; j<a.length;j++){

	                 int rowSum = 0;
	                 int indexSum=0;
	                
	                if (a.length%2==0){
	                    indexSum += a.length;
	                    System.out.println(indexSum);
	                }
	                // System.out.println(a.toString());
	             }    
	         }

		
	}
}