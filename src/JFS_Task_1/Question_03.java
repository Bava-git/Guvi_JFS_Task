package JFS_Task_1;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {

		// Write down the program to reverse the given number using loops

		// Scanner object for get user input
		Scanner scan = new Scanner(System.in);

		// read user input and convert them to string for get the length.
		System.out.print("Enter the number to reverse : ");
		int inputValue = scan.nextInt();
		int outputValue = 0;
		String numTOstr = Integer.toString(inputValue);
		int lengthofnum = numTOstr.length();
		
		// Initiating For loop reverse the number.
		for (int i = 0; i < lengthofnum; i++) {
			int localStore = inputValue % 10;
			outputValue = outputValue * 10 + localStore;
			inputValue /= 10;
		}
		
		// Display the output
		System.out.print("Reversed number : ");
		System.out.println(outputValue);

		// Exit from program
		System.exit(0);

	}

}
