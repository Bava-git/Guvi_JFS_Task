package JFS_Task_3;

public interface Taxable {

//	create interface taxable with members salesTax=7% and incomeTax = 10.5%
//	create abstract method calcTax()

	double salesTax = 0.07d;
	double incomeTax = 0.105d;

	double calcTax();

}
