package JFS_Task_5;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Question_01 {

//	Q1. Write a program using map() method, to convert a list of Strings into uppercase. 
//	If the given List is: `Stream names = Stream.of("aBc", "d", "ef");`

	public static void main(String[] args) {

		// Given list
		Stream<String> names = Stream.of("aBc", "d", "ef");

		// Using map() to convert to UpperCase and collect into list
		List<String> upperCaseNames = names.map(String::toUpperCase)
											.collect(Collectors.toList());

		// Display Output
		System.out.println("Convert give list to UpperCase using map()");
		System.out.println();
		System.out.println("UpperCase List: " + upperCaseNames);

	}

}
