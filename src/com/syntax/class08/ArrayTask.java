package com.syntax.class08;

public class ArrayTask {

	public static void main(String[] args) {
		/*Create a 2D array (longer way)where you will
		 * store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		 
After storing values print following String:
Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
*/

		String [][] names= new String[4][4];
		
		names [0][0] = "Mr";
		names [0][1] = "Mrs";
		names [0][2] = "Ms";
		names [0][3] = "Miss";
		
		names [1][0] = "Smith";
		names [1][1] = "Jordan";
		names [1][2] = "Jackson";
		names [1][3] = "Obama";
		
		int [][] num = {{1,2,3,4,5,6},{23,45,67,12,45}, {654, 434, 5,54}};
		
		for (int [] firstnum: num) {
			
			for (int second : firstnum) {
				System.out.print(second+ " ");
			}
			System.out.println(".");
		}
		System.out.println("-----------------------");
	System.out.println(names [0][1] + " " + names [1][0] + ", "+names [0][0]+  " " + names [1][3] +
				", "+names [0][2]+  " " + names [1][2]+ ", and "+names [0][3]+  " " + names [1][1] );
		
		
		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names and second array
		 * will contain grades. Then your program should print name of the students that has A and B grads
		 */
	
		
		String [][] nameGrade = {{"John", "joe","Adam", "Lily"},{"A", "B", "C", "A"}};
		
		
for (int i = 0; i< nameGrade.length; i++ ) {
			
			for (int j = 0; j< nameGrade [i].length; j++ ) {
System.out.print (nameGrade [i][j]+ " ");
			}
			System.out.println();
		}
		

		System.out.println(nameGrade [0][0] + "= " + nameGrade [1][0] + ", "+nameGrade [0][2]+  "= " + nameGrade [1][3] +
				", "+nameGrade [0][3]+  "= " +nameGrade [1][1] );
	
	}

}
