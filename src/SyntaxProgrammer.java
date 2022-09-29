import java.util.Scanner;

public class SyntaxProgrammer {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("I am a Java Programmer. ");

		System.out.println("I study at Syntax.");

		System.out.println("I am trying love Java!");

		System.out.println("!!!");
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String nameFirstThenLast = scanner.nextLine();
		
		char letter = nameFirstThenLast.charAt(2);
		System.out.println(letter);
		
		
	}
}
