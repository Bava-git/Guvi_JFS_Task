package JFS_Task_2;

public class Employee extends Person {

//	1.4) Define a base class Person with attributes name and age. 
//	Create a subclass Employee that inherits from Person and adds attributes like employeeID and salary. 
//	Use the super keyword to initialize the Person attributes in the Employee constructor.

	// Attributes.
	String EmployeeID;
	double Salary;

	// Parameterized Constructor.
	public Employee(String employeeID, double salary, String Person_Name, int Person_Age) {
		super(Person_Name, Person_Age);
		EmployeeID = employeeID;
		Salary = salary;
	}

	public static void main(String[] args) {

		// create employee
		Employee employee = new Employee("12345", 200000, "Bava", 30);
		employee.DisplayEmployeeDetails();
		
		// Exit the program
		System.exit(0);

	}

	// Display employee details
	public void DisplayEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("");
		// call method from subclass
		super.DisplayPersonalDetails();
		System.out.println("Employee ID : " + EmployeeID);
		System.out.println("Salary : " + Salary);
	}

}
