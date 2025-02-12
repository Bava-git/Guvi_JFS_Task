package JFS_Task_4;

import java.util.HashMap;

public class Question04_Main {

//	Q4. Create a Hash Map where keys are student names (strings) and values are their corresponding grades (integers). 
//	Create methods to add a new student, remove a student, and Display up a student's grade by name.

	HashMap<String, Integer> student = new HashMap<>();

	// Method to add new student
	void addStudent(String studentName, int stringGrade) {
		student.put(studentName, stringGrade);
		displayHashMap();
	}

	// Method to remove a student
	void removeStudent(String studentName) {

		if (student.containsKey(studentName)) {
			student.remove(studentName);
			displayHashMap();
		} else {
			System.out.println("Student not found");
		}

	}

	// Display up a student's grade by name.
	void displayStudent(String studentName) {

		if (student.containsKey(studentName)) {
			int Grade = student.get(studentName);
			System.out.println(studentName + "'s grade " + Grade);
		} else {
			System.out.println("Student not found");
		}
	}

	// Display HashMap content
	void displayHashMap() {
		System.out.println("HashMap content: " + student);
	}

	public static void main(String[] args) {

		Question04_Main Student = new Question04_Main();

		// adding 2 students
		System.out.println("Adding student");
		Student.addStudent("Bava", 100);
		Student.addStudent("Khan", 15);

		System.out.println();

		// display grade of student
		System.out.println("Display student grade");
		Student.displayStudent("Bava");

		System.out.println();

		// remove a student
		System.out.println("Remove student");
		Student.removeStudent("Khan");

		// Exit from program
		System.exit(0);
	}
}
