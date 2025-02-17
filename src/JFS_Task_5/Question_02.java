package JFS_Task_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_02 {

//	Q2. Write a program to check whether the Strings in the List are empty or not
//	and print the list having non-empty strings. 
//	If the given List is: `Liststrings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");`

	public static void main(String[] args) {

		// Given List
		List<String> givenList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		// Filter non-empty strings using Stream API
		List<String> nonemptyList = givenList.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.toList());

		// Display output
		System.out.println("Filter non-empty strings from given string");
		System.out.println("Given List: " + givenList);
		System.out.println();
		System.out.println("Non-empty strings: " + nonemptyList);

	}
}
