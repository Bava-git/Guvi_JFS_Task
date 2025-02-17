package JFS_Task_5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Question_04 {
	
//	Q4. Rajesh has been given a task to create an app which takes the user's birth date as input and 
//	calculates their age `java.time.LocalDate` class. you have to help him to build this app using the  
//	Input:  
//	Enter your birth date `(yyyy-mm-dd): 1990-05-15`  
//	Output:  
//	Your age is: 33 years, 4 months, and 13 days.

	public static void main(String[] args) {
		
		// Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Find today date
		LocalDate todayDate = LocalDate.now();
		
		// Get DOB from user
		System.out.println("Calculate the age..");
		System.out.println("Dev By: Rajesh");
		System.out.println();
		System.out.print("Enter your birth date (yyyy-mm-dd): ");
		String inputDOB = scan.next();
		
		try {
		// Convert String to Date
		LocalDate StrToDate = LocalDate.parse(inputDOB);
		
		// Calculate date difference
        Period age = Period.between(StrToDate, todayDate);
        
        // Display output
        System.out.println();
        System.out.println("Your age is: " +
                age.getYears() + " years, " +
                age.getMonths() + " months, and " +
                age.getDays() + " days.");
		} catch(DateTimeParseException e) {
			System.out.println("Invaild date, Date format must be yyyy-mm-dd.");
		}
	}

}
