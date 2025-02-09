package JFS_Task_3;

public class Product implements Taxable {

	// b, create class Product(pid, price, quantity) and implement Taxable to
	// calculate salesTax on unit price of product.
	String Product_Id;
	double Product_Price;
	int Product_Quantity;

	// Parameterized constructor
	public Product(String product_Id, double product_Price, int product_Quantity) {
		this.Product_Id = product_Id;
		this.Product_Price = product_Price;
		this.Product_Quantity = product_Quantity;
	}

	// Override calcTax method
	@Override
	public double calcTax() {
		return Product_Price * salesTax;
	}

	// Getter
	String getProduct_Id() {
		return Product_Id;
	}

	double getProduct_Price() {
		return Product_Price;
	}

	int getProduct_Quantity() {
		return Product_Quantity;
	}

}
