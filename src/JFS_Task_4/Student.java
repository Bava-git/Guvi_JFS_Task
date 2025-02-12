package JFS_Task_4;

public class Student {

	// Data member
	private int Student_Rollno;
	private String Student_Name;
	private int Student_Age;
	private String Student_Course;

	public Student() {
		System.out.println("Please complete the new student form below. ");
	}

	// a, class student with attributes roll no, name and course initialize values
	// through parameterized constructor
	// Parameterized constructor
	public Student(int student_Rollno, String student_Name, int student_Age, String student_Course)
			throws NameNotFoundException, AgeNotWithinRangeException {

		setStudent_Rollno(student_Rollno);
		setStudent_Name(student_Name);
		setStudent_Age(student_Age);
		setStudent_Course(student_Course);
		displayStudentList();
	}

	public int getStudent_Rollno() {
		return Student_Rollno;
	}

	public void setStudent_Rollno(int student_Rollno) {
		Student_Rollno = student_Rollno;
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	// c, if a name contains numbers or special symbols raise exception
	// "NameNotValidException", define the two exception classes.
	public void setStudent_Name(String student_Name) throws NameNotFoundException {

		// allows only alphabetic
		String regex = ".*[0-9\\W_]+.*";

		// match the value to throw exceptions
		if (student_Name.matches(regex)) {
			throw new NameNotFoundException("Illegal characters, student name contains numbers or special symbols");
		} else {
			Student_Name = student_Name;
		}

	}

	public int getStudent_Age() {
		return Student_Age;
	}

	// b, if the age of the student is not between 15 to 21 then generate a
	// user-defined exception "AgeNotWithinRangeException"
	public void setStudent_Age(int student_Age) throws AgeNotWithinRangeException {

		// match the value to throw exceptions
		if (student_Age < 15 || student_Age > 21) {
			throw new AgeNotWithinRangeException("Not eligible, age of the student is not between 15 to 21");
		} else {
			Student_Age = student_Age;
		}
	}

	public String getStudent_Course() {
		return Student_Course;
	}

	public void setStudent_Course(String student_Course) {
		Student_Course = student_Course;
	}

	void displayStudentList() {

		// Display student details
		System.out.println("Student Roll number : " + Student_Rollno + " / Student Name : " + Student_Name
				+ " / Student Age : " + Student_Age + " / Student Course : " + Student_Course);
	}

}
