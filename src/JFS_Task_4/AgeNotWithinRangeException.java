package JFS_Task_4;

// b, if the age of the student is not between 15 to 21 then generate a user-defined exception "AgeNotWithinRangeException"
public class AgeNotWithinRangeException extends Exception {

	// this class extends with exception for custom exception
	public AgeNotWithinRangeException(String msg) {
		super(msg);
	}

}