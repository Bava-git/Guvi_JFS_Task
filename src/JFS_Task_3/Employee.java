package JFS_Task_3;

public class Employee implements Taxable {

	// a, create class Employee(empId, name salary) and implement Taxable to
	// calculate incomeTax on yearly salary.
	String Employee_Id, Employee_Name;
	double Salary;

	// Parameterized constructor
	public Employee(String employee_Id, String employee_Name, double salary) {
		this.Employee_Id = employee_Id;
		this.Employee_Name = employee_Name;
		this.Salary = salary;
	}

	// Override calcTax method
	@Override
	public double calcTax() {
		return (Salary * 12) * incomeTax;
	}

	// Getter
	String getEmployee_ID() {
		return Employee_Id;
	}

	String getEmployee_Name() {
		return Employee_Name;
	}

	double getSalary() {
		return Salary;
	}

}
