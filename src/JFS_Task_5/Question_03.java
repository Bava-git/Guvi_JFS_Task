package JFS_Task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_03 {

//	Q3. You are a teacher in school .In your class there are 10 students, 
//	you have decided to give special gifts to those students whose names start with "A". 
//	you are asked to separate those students with the help of a java program.  
//	
//	Requirement:
//	- Use List interface to store the student name
//	- Use a lambda expression and the Stream API to filter the students

	public static void main(String[] args) {

		// List of Students
		List<String> studentsList = Arrays.asList("Ashik", "Vishnu", "Parveen", "Aysha", "Arun", "Ishwariya", "John",
				"Anushiya", "Rohan", "Bava");

		// Using Stream API and lambda expression to filter the students
		List<String> filteredStudents = studentsList.stream().filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());

		// Display output
		System.out.println("Students List: " + studentsList);
		System.out.println();
		System.out.println("Eligible students for gift: " + filteredStudents);

	}

}
