package JFS_Task_2;

public class BankAccount {

//	1.3) Create Class Account with data member As Balance. Create two constructors (no argument, 
//	and two arguments) and perform following task a, b and c.

	// Data member
	int Balance;

	// No argument constructor
	BankAccount() {
		// Minimum Balance
		Balance = 500;
	}

	// Two argument constructor
	BankAccount(int deposit, int withdraw) {

		// Minimum Balance
		Balance = 500;

		// Call method for deposit and withdraw
		Deposit(deposit);
		Withdraw(withdraw);

	}

	// c. method to display the Balance
	// Show Balance
	void DisplayBalance() {
		System.out.println("Your account balance is " + this.Balance);
	}

	// a. method to deposit the amount to the account.
	// Deposit money from account
	void Deposit(int Amount) {

		// validate deposit amount should not 0 or lower
		if (Amount <= 0) {
			System.out.println("Invalid Amount, Please check the amount");
			System.exit(0);
		} else {
			this.Balance += Amount;
			System.out.println("Deposited Amount : " + Amount);
		}

	}

	// b. method to withdraw the amount from the account.
	// Withdraw money from account
	void Withdraw(int Amount) {

		// validate withdraw amount should not 0 or lower and same time amount should
		// available in the account
		if ((Amount <= 0) && (this.Balance >= Amount)) {
			System.out.println("Invalid Amount, Please check the amount");
			System.exit(0);
		} else {
			this.Balance -= Amount;
			System.out.println("Withdraw Amount : " + Amount);
		}

	}

	public static void main(String[] args) {


		System.out.println("Welcome to VIP bank");
		System.out.println("Please note Minimum balance is 500 rupees");
		System.out.println();

		System.out.println("No argument constructor");
		BankAccount Account1 = new BankAccount();
		Account1.Deposit(10);
		Account1.Withdraw(200);
		Account1.DisplayBalance();

		System.out.println();

		System.out.println("Two argument constructor");
		BankAccount Account2 = new BankAccount(1000, 500);
		Account2.DisplayBalance();

		// Exit the program
		System.exit(0);

	}

}
