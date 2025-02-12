package JFS_Task_4;

// c, if a name contains numbers or special symbols raise exception "NameNotValidException", define the two exception classes.
public class NameNotFoundException extends Exception {

	// this class extends with exception for custom exception
	public NameNotFoundException(String msg) {
		super(msg);
	}

}