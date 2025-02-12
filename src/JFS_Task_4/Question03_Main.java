package JFS_Task_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question03_Main {

//	Q3. Store name of weekdays in an array (starting from "Sunday" at 0 index). 
//	Ask day position from user and print day name. Handle array index out of bound exception and give proper message 
//	if user enters day index outside range (0-6).

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Store day in array
		String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saterday" };

		try {

			// Get number from user
			System.out.println("To know day from index..");
			System.out.print("Enter index (0-6) : ");
			int input = scan.nextInt();
			System.out.println("Day: " + weekdays[input]);
		} catch (ArrayIndexOutOfBoundsException e) {

			// Error massage
			System.out.println("Invalid index. Please enter a number between 0 and 6.");
		} catch (InputMismatchException e) {

			// Error massage
			System.out.println("Invalid value. Please enter only in number");
		} finally {
			// Exit the program
			System.exit(0);
		}
	}

}
