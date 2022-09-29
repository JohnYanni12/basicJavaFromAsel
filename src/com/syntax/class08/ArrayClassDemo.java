package com.syntax.class08;

public class ArrayClassDemo {

	public static void main(String[] args) {

		char[] letters = new char[6];
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'E';
		letters[5] = 'F';
		System.out.println(letters[3]);
		
		
		char[] letters1 = { 'a', 'b', 'c', 'd', 'e', 'f' };

		System.out.println(letters1[4]);

		String[] names = new String[3];
		names[0] = "john";
		names[1] = "James";
		names[2] = "joe";

		System.out.println(names[0]);

		String[] names1 = { "joe", "John", "James" };

		System.out.println(names[1]);

		String[] words = new String[5];
		words[0] = "is";
		words[1] = "day";
		words[2] = "coding";
		words[3] = "Saturday";
		words[4] = "Java";
		System.out.println(words[3] + " " + words[0] + " " + words[4] + " " + words[2] + " " + words[1]);

		String[] words1 = { "java", "day", "is", "Saturday", "coding" };
		System.out.println(words[3] + " " + words[2] + " " + words[0] + " " + words[4] + " " + words[1]);

	}

}
