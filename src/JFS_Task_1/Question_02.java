package JFS_Task_1;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		
		// Write a program that find a given number negative or positive

		// Scanner object for input
		Scanner scan = new Scanner(System.in);
		
		// Get value from user
		System.out.print("Please insert an number: ");
		int inputValue = scan.nextInt();
		
		// init if for compare given value with 0 to testament the output
		if (inputValue < 0) {
			System.out.println("Given value is Negative");
		} else {
			System.out.println("Given value is Positive");
		}
		
		// Exit from program
		System.exit(0);

	}

}
