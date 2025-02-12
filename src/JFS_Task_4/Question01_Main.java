package JFS_Task_4;

import java.util.Scanner;

public class Question01_Main {

//	Ramesh is developing a student management system for a university
//	in this system you have a student class to represent student information
//	you are asked to help ramesh to handle exception which can be occurred into program 
//	according to a, b and c scenarios

	public static void main(String[] args) throws NameNotFoundException, AgeNotWithinRangeException {

		// scanner object
		Scanner scan = new Scanner(System.in);

		System.out.println("Student management system, Guvi university");
		System.out.println("Dev By: Ramesh, Bava");
		System.out.println();

		// get student details from user and same time validate the value.
		Student student1 = new Student();
		System.out.print("Student Roll number :");
		int rollno = scan.nextInt();
		System.out.print("Student Name :");
		String name = scan.next();
		student1.setStudent_Name(name);
		System.out.print("Student Age :");
		int Age = scan.nextInt();
		student1.setStudent_Age(Age);
		System.out.print("Student Course :");
		String course = scan.next();

		System.out.println();
		student1 = new Student(rollno, name, Age, course);

		System.out.println();
		System.out.println("Parameterized constructor :");
		Student student2 = new Student(12345, "Bava", 20, "IT");

		// Exit program
		System.exit(0);

	}

}
