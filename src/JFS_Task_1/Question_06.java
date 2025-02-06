package JFS_Task_1;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		
		// Write a java program to print 55555,54444,54333,54322,54321

		// Scanner object for get input.
		Scanner scan = new Scanner(System.in);

		// Get value from user.
<<<<<<< HEAD
<<<<<<< HEAD
		// System.out.println("To generate matrix");
=======
//		System.out.println("To generate matrix");
>>>>>>> d0a3402 (JFS Task 2)
=======
//		System.out.println("To generate matrix");
>>>>>>> d0a3402239e910a44747462e23595e7d106e9e9d
		System.out.print("Enter an number : ");
		int inputValue = scan.nextInt();

		// Initiating a For loop with "i".
		for (int i = 0; i < inputValue; i++) {

			// Initiating a For loop with "j".
			for (int j = 0; j < inputValue; j++) {

				int outputValue = 0;

				// Initiating a IF statement.
				if (j > i) {
					outputValue = inputValue - i;
				} else {
					outputValue = inputValue - j;
				}

				System.out.print(outputValue);
			}

			// Goto next line.
			System.out.println();
		}

		// Exit from program.
		System.exit(0);

	}

}
