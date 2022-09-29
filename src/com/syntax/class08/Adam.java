package com.syntax.class08;

import java.util.Scanner;

public class Adam {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i;
//		int[] num = new int[5];
//
//		Scanner numbers = new Scanner(System.in);
//
//		for (i = 0; i <= num.length - 1; i++) {
//
//			num[i] = numbers.nextInt();
//		}
//		System.out.println("");
//		System.out.println("The number in reversed:");
//		System.out.println("");
//
//		for (i = num.length-1; i >=0 ; i--) {
//
//			System.out.println(num[i]);
//
//		}

//		   Scanner scanner = new Scanner(System.in);
//			int []num = new int[5];
//		    
//		    int i;
//
//		    for(i = 0; i< num.length ; i++){
//		         num [i] = scanner.nextInt();
//		    }
//		    
//		   for (i = 0; i< num.length ; i++){
//			   int  numbers = num[i] *10;
//			   System.out.println (numbers);  
//		   }

//		int[][] numbers = { { 0, 1, 2, 3, 4, 5, 6 }, { 0, 1, 2, 3, 4, 5, 6 } };
//
//		for (int[] num : numbers ) {
//		
//		}
//		System.out.print(numbers[0][1] +"."+ numbers[1][4] +" "+
//						numbers[0][2] +"."+ numbers[1][0] +" "+
//						numbers[0][3] +"."+ numbers[1][3] +" "+
//						numbers[0][2] +"."+ numbers[1][0]);
//		
//		System.out.println();
//		System.out.print(numbers[0][4] +"."+ numbers[1][0] +" "+
//				numbers[0][1] +"."+ numbers[1][5] +" "+
//				numbers[0][6] +"."+ numbers[1][1] +" "+
//				numbers[0][1] +"."+ numbers[1][0]);
//		
//		System.out.println();
//		System.out.print(numbers[0][1] +"."+ numbers[1][2] +" "+
//				numbers[0][3] +"."+ numbers[1][1] +" "+
//				numbers[0][4] +"."+ numbers[1][0] +" "+
//				numbers[0][1] +"."+ numbers[1][6]);

//		
//		
//		      for (int i = 1; i<=10; i++ ){
//		    	
//
//		      if (i <=10) {
//		    	  System.out.print(i + " "); 
//		      
//		    	  continue; 
//		      }
//		      
//		    i -= i;
//		    if (i >= 20) {
//		    i = i*2;
//		    }	
//		    	  System.out.println(i + " "); 
//		    	  break;

//		      }
//		      }
//		      System.out.println(" ");
//		      for (int i = 2; i<=20; i +=2 ){
//		          System.out.print(i + " ");
//		      }
//		      
//		      System.out.println(" ");
//		      for (int i = 3; i<=30; i +=3 ){
//		          System.out.print(i + " ");
//		      }
//
//		      System.out.println(" ");
//		      for (int i = 4; i<=40; i +=4 ){
//		          System.out.print(i + " ");
//		      }
//
//		      System.out.println(" ");
//		      for (int i = 5; i<=50; i +=5 ){
//		          System.out.print(i + " ");

//		int[] number = { 5, 4, 8 };
//
//		for (int i = 0; i < number.length; i++) {
//			for (int j = 0; i < 1; i++) {
//
//				if (number[0] > number[1] && number[0] > number[2]) {
//					System.out.println(number[0]);
//
//				}
//				if (number[1] > number[0] && number[0] > number[2]) {
//					System.out.println(number[1]);
//
//				}
//
//				if (number[2] > number[0] && number[2] > number[1]) {
//					System.out.println(number[2]);
//				}
//			}
//		}

//		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
//		int sum = 0;
//		for (int[] number : a) {
//			for (int num : number) {
//			
//			sum += num;
//			}
//			
//		}
//		System.out.println(sum);
//	}
//}

		// ************************************************88

//		int[][] a = { { 1, 1, 2 }, // sum = 4
//				{ 3, 1, 2 }, // sum = 6
//				{ 3, 5, 3 }, // sum = 11
//				{ 0, 1, 2 } // sum = 3
//		};

		// int sum = 0;
//		int i = 0;
//		for (int j = 0; j < a.length; j++) {
//			for (i = 0; i <a.length ; i++) {
//				
//			}
//			
//		}
////		System.out.println(a);

		// Prime numbers
		// **********************************************
//		int num = 55;
//        boolean isPrime=true;
//    
//
//            for(int i=2;i<num;i++) {
//                if(num%i==0) {
//                    isPrime=false;
//                    break;
//                }
//            }
//        
//
//        if(isPrime) {
//            System.out.println(num+" is Prime");
//        }else {
//
//            System.out.println(num+" is not Prime");
//        }
//********************************************************
		/**
		 * For you to do:**
		 * 
		 * Write a program that sums all numbers that are on even index and on even row.
		 **          
		 * Expected Output:**
		 * 
		 * ``` -4
		 */
		int j = 0;
		int i = 0;
		int indexSum=0;
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int sum = 0;
		for (i = 0; i < a.length; i++) {
			if (a [i][j] % 2 == 0) {
				indexSum += a[i][j];
		}
			for (j = 0; j < a.length; j++) {

				int rowSum = 0;
				

				if (a[i][j] % 2 == 0) {
					indexSum += a[i][j];
				}		
			}
		}
		System.out.print(indexSum);

}
}
