package JFS_Task_1;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {

		// Write a java program to find the smallest number among three numbers

		// Scanner object for get input
		Scanner scan = new Scanner(System.in);

		// Get value from user (only reads in int)
		System.out.println("To find smallest number please insert the number below");
		System.out.print("Enter Number 1 : ");
		int Number_1 = scan.nextInt();
		System.out.print("Enter Number 2 : ");
		int Number_2 = scan.nextInt();
		System.out.print("Enter Number 3 : ");
		int Number_3 = scan.nextInt();

		// initialize IF statement for compare 3 numbers 
		if ((Number_1 < Number_2) && (Number_1 < Number_3)) {  // if Number_1 is lowest
			System.out.println("Number 1 is the smallest number among three numbers");
		} else if ((Number_2 < Number_1) && (Number_2 < Number_3)) {  // if Number_2 is lowest
			System.out.println("Number 2 is the smallest number among three numbers");
		} else {                                         // else Number_3 is lowest
			System.out.println("Number 3 is the smallest number among three numbers");
		}

		// Exit from program
		System.exit(0);

	}

}
