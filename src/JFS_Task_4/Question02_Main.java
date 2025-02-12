package JFS_Task_4;

public class Question02_Main {

//	Q2. Create a class Voter(voter Id, name, age) with parameterized constructor. The parameterized constructor should throw a checked exception 
//	if age is less than 18. The message of exception is "invalid age for voter "

	public static void main(String[] args) throws AgeNotWithinRangeException {

		// over 18
		Voter person1 = new Voter("DMY2292878", "Bava", 20);

		// unable to provide Voter Id because person is under 18
		Voter person2 = new Voter("", "Bava", 16);

	}

}
