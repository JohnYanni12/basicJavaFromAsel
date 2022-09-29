import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		
		/*
		 * Write a Java program that reads in two floating-point numbers and tests
		 * whether they are the same up to three decimal places.
		 * 
		 * 
		 * Test Data Input floating-point number: 25.586 Input floating-point another
		 * number: 25.589 /*int i, j, n;
		 * 
		 * System.out.print("Please enter unmber of n: "); Scanner in = new
		 * Scanner(System.in);
		 * 
		 * n = in.nextInt();
		 * 
		 * // c = in.nextInt();
		 * 
		 * for (i=1; i <= n ; i++) { for (j = 1; j <= i; j++)
		 * 
		 * System.out.print(i); System.out.println("");
		 */

//		int i, n;
//		
//		
//		System.out.print("Please enter unmber of n: ");
//		Scanner in = new Scanner(System.in);
//		n = in.nextInt();
//		
//		for (i =1 ; i<=n ; i++) {
//		
//			
//		System.out.println("The number " +i + ": the cupc is " + (i*i*i));

//		}
//		int i, n;
//		System.out.print("Please enter unmber of n: ");
//		Scanner in = new Scanner(System.in);
//		n = in.nextInt();
//		for (i =1 ; i<=n ; i++) {
//			
//			System.out.println("The number " +n + " X "+ i +" = "+ (n*i));

		//int i, n, sum = 0;
//		System.out.print("Please enter unmber of n: ");
//		Scanner in = new Scanner(System.in);
//		n = in.nextInt();
//		System.out.println (sum);

//		for (i =1 ; i<=n ; i++) 
//		{
//			System.out.println (2*i-1);
//			sum += 2*i-1;
//		}
//		int y= 1;
//		do {
//			
//		//System.out.print ("Hi Adam " + y);
//		System.out.print (y* y + " ");
//		y++;
//		}
//		while (y <= 4);
////		System.out.print ("Hi Lily " + y);
////		System.out.println ("Hi Adam " + y);
//		
////		y++;

//		int num = 50;
//
//		while (num >= 20) {
//
//			System.out.print(num + " ");
//			num--;
//
//		}
//		
//		System.out.println(" ");
//		System.out.println(" ");
//		int evenNum = 2;
//		while (evenNum <= 20) {
//
//			if (evenNum % 2 == 0) {
//				System.out.print(" ");
//				System.out.println(evenNum);
//			}
//			evenNum++;
//		}
		//Print numbers from 100 to 1
		int nn = 100;
		
		while (nn >= 1) {
		
		System.out.print(nn + " ");
		nn--;
		}
		//Print even numbers from 20 to 100 
		System.out.println ();
		int i = 20;
		
		while(i <= 100) {
		
			if (i % 2==0) {
				System.out.print(i + " ");
		}
			i++;
		}
		
		
		//Print only odd numbers from 100 to 1
		//(2 different ways)
		System.out.println("");
		int l = 99;
		
		while (l >=1) {
		//	if(l % 1==0)
			System.out.print(l+ " " );
			l-=2;
		}
		System.out.println("");
		int jk = 100;
		
		while (jk >=1) {
		if(jk % 2==1) {
			System.out.print(jk+ " " );
		}
		jk--;
		}
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		String answer;
		do { 
		System.out.print("Did you get the job? ");
		answer = sc.nextLine();
		}
		while (!answer.equalsIgnoreCase("yes"));
		
		System.out.print("Good for you, where is our money then? ");
				
	}
}
