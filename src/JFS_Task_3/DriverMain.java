package JFS_Task_3;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DriverMain {

	// c, create class for main method (say DriverMain), accept employee information
	// and a product information from user and print out income tax and sales tax
	// respectively.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// format tax amount in 2 decimal
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setGroupingSeparator(',');
		DecimalFormat df = new DecimalFormat("#,##,###.00", symbols);

		// getting employee details
		System.out.println("Please fill the following details to calculate income Tax for yearly");
		System.out.print("Employee ID : ");
		String Employee_Id = scan.next();
		System.out.print("Employee Name : ");
		String Employee_Name = scan.next();
		System.out.print("Salary : ");
		int Salary = scan.nextInt();

		// call Employee class
		Employee emp = new Employee(Employee_Id, Employee_Name, Salary);

		// call calcTax method from Employee class and format the result
		String incomeTax = df.format(emp.calcTax());
		System.out.println("Yearly Income Tax for " + Employee_Name + " is " + incomeTax);

		System.out.println();

		// getting product details
		System.out.println("Please fill the following details to calculate sales Tax");
		System.out.print("Product ID : ");
		String Product_Id = scan.next();
		System.out.print("Product Price : ");
		float Product_Price = scan.nextFloat();
		System.out.print("Product Quantity : ");
		int Product_Quantity = scan.nextInt();

		// call Product class
		Product product = new Product(Product_Id, Product_Price, Product_Quantity);

		// call calcTax method from Product class and format the result
		String salesTax = df.format(product.calcTax());
		System.out.println("Sales Tax for product with ID " + Product_Id + " : " + salesTax);

	}

}
