package JFS_Task_4;

public class Voter {

	String Voter_Id;
	String Voter_Name;
	int Voter_Age;

	public Voter(String voter_Id, String voter_Name, int voter_Age) throws AgeNotWithinRangeException {

		// if age is under 18 then it will throw exception
		if (voter_Age < 18) {
			throw new AgeNotWithinRangeException("Not eligible, Invalid age for voter");
		} else {
			Voter_Age = voter_Age;
		}

		Voter_Id = voter_Id;
		Voter_Name = voter_Name;

		displayResult();
	}

	void displayResult() {

		// Display voter details
		System.out.println("Voter ID : " + Voter_Id + " / Voter Name : " + Voter_Name + " / Voter Age : " + Voter_Age);

		System.out.println();
	}

}
