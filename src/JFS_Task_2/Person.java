package JFS_Task_2;

public class Person {

	// 1.1) Create a class Person with properties (name and age) with following features.
	

	// data member
	private String Person_Name;
	private int Person_Age;

	// Default constructor.
	Person() {
		this.Person_Age = 18;
	}

	// Parameterized constructor.
	Person(String name, int age) {
		this.Person_Name = name;
		this.Person_Age = age;
	}

	public static void main(String[] args) {

		// a. Default age of person should be 18.
		// Print Person name and default age.
		Person Person1 = new Person();
		Person1.Person_Name = "Ashik";
		Person1.DisplayPersonalDetails();
		
		System.out.println();

		// b. A person object can be initialized with name and age.
		// Print Person name and age.
		Person Person2 = new Person("Hussain", 30);
		Person2.DisplayPersonalDetails();

		// Exit the program
		System.exit(0);

	}


	// c. Method to display name and age of person.
	// Display personal details
	public void DisplayPersonalDetails() {
		System.out.println("Name : " + Person_Name);
		System.out.println("Age : " + Person_Age);
	}

}
