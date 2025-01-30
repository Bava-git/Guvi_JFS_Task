package JFS_Task_1;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {

		// Discount calculator

		// Scanner object for get input
		Scanner scan = new Scanner(System.in);

		// Get value from user
		System.out.print("Enter purchase amount to get discount : ");
		double purchaseAmount = scan.nextDouble();

		// initialize IF statement for find discount percentage
		if (purchaseAmount > 1000) { // Above 1000
			purchaseAmount = purchaseAmount - (purchaseAmount * 0.20);
			System.out.println("Congratulations, you've won a 20% discount! Please proceed with " + purchaseAmount);
		} else if ((purchaseAmount >= 500) && (purchaseAmount <= 1000)) { // Between 500 to 1000
			purchaseAmount = purchaseAmount - (purchaseAmount * 0.10);
			System.out.println("Congratulations, you've won a 10% discount! Please proceed with " + purchaseAmount);
		} else {														// Below 500
			purchaseAmount = 500 - purchaseAmount;
			System.out.println("Sorry, you are not eligiable for discount, ");
			System.out.println("please purchase something for " + purchaseAmount + " rupees to get 10% discount..!");
		}

		// Exit from program
		System.exit(0);

	}

}
