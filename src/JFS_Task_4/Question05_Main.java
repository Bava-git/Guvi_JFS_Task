package JFS_Task_4;

public class Question05_Main {

//	Q5. Use Collection Classes to store Integers. Create some methods for a, b and c functionalities.  

	public static void main(String[] args) {

		MyStack stackMain = new MyStack();

		// Push elements onto the stack
		stackMain.pushElement(1);
		stackMain.pushElement(2);
		stackMain.pushElement(3);

		stackMain.DisplayStack();

		System.out.println();

		// Pop elements from the stack
		// Stack operates on a Last-In, First-Out (LIFO)
		stackMain.popElement(); // 3
		stackMain.popElement(); // 2
		stackMain.popElement(); // 1
		stackMain.popElement();
		stackMain.DisplayStack();

		System.out.println();

		// Check if the stack is empty
		stackMain.isStackEmpty();

	}

}
