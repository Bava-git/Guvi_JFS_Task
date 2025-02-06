package JFS_Task_2;

import java.util.Scanner;

public class ProductMain {

//	1.2) Create a main function in different class (say ProductMain) and perform following task a, b, and c:

	public static void main(String[] args) {

		// a. Accept five product information from user and store in an array 
		Scanner scan = new Scanner(System.in);
		Product[] products = new Product[5];

		// get details from user
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the details of Product " + (i + 1));
			System.out.print("Product ID : ");
			String Pid = scan.next();

			System.out.print("Price : ");
			double Price = scan.nextDouble();

			System.out.print("Quantity : ");
			int Quantity = scan.nextInt();

			products[i] = new Product(Pid, Price, Quantity);
		}

		// b. Find Pid of the product with the highest price.
		// set initial value
		double highestPrice = products[0].getPrice();
		String highestPricePid = products[0].getPid();

		for (Product product : products) {
			if (product.getPrice() > highestPrice) {
				highestPrice = product.getPrice();
				highestPricePid = product.getPid();
			}
		}
		System.out.println();
		System.out.println("Highest Price Product ID is " + highestPricePid);
		
		// c. Create method (with array of product's object as argument) in ProductMain class to calculate and return the 
		// total amount spent on all products. (amount spent on single product-price of product * quantity of product).

		ProductMain obj = new ProductMain();
		double TotalAmountSpent = obj.CalcuteTotal(products);
		System.out.println();
		System.out.println("Total amount spent on all products is " + TotalAmountSpent + " rupees");
		
		// Exit the program
		System.exit(0);

	}

	double CalcuteTotal(Product[] products) {

		double TotalAmountSpent = 0;
		for (Product product : products) {
			TotalAmountSpent += product.getPrice() * product.getQuantity();
		}
		return TotalAmountSpent;
	}

}
