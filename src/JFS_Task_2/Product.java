package JFS_Task_2;

public class Product {

//	1.2). Create class Product (pid, price, quantity) with parameterized constructor. 
//	Create a main function in different class (say ProductMain) and perform following task a, b, and c: 

	// Data member
	String Pid;
	double Price;
	int Quantity;

	// Parameterized constructor
	public Product(String pid, double price, int quantity) {
		this.Pid = pid;
		this.Price = price;
		this.Quantity = quantity;
	}

	// getter
	String getPid() {
		return Pid;
	}

	double getPrice() {
		return Price;
	}

	int getQuantity() {
		return Quantity;
	}

}
