package JFS_Task_1;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		
		// Write a program that find a given number negative or positive

		// Scanner object for get input
		Scanner scan = new Scanner(System.in);
		
		// Get value from user
		System.out.println("To find a number is negative or positive");
		System.out.print("Please insert an number: ");
		double inputValue = scan.nextDouble();
		
		// Initiating IF statement for compare given value with 0 to testament the output
		if (inputValue < 0) {
			System.out.println(inputValue + " is Negative number");
		} else {
			System.out.println(inputValue + " is Positive number");
		}
		
		// Exit from program
		System.exit(0);

	}

}
