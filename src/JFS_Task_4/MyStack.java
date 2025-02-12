package JFS_Task_4;

import java.util.Stack;

public class MyStack {

	private Stack<Integer> stack;

	public MyStack() {
		stack = new Stack<Integer>();
	}

	//	a. Include functions for pushing elements onto the stack.  
	// Method to push element into stack
	public void pushElement(int element) {
		stack.push(element);
		System.out.println("Pushed element: " + element);
	}

	//	b. popping elements from the stack.
	// Method to pop element from stack
	public void popElement() {

		// Check if the stack is empty
		if (stack.isEmpty()) {
			System.out.println("Stack is empty. Cannot pop element.");
			return;
		}

		int PopElement = stack.pop();
		System.out.println("Popped element: " + PopElement);
	}

	// c. checking if the stack is empty
	// Method to check if the stack is empty
	public void isStackEmpty() {

		boolean isEmpty = stack.isEmpty();
		System.out.println("Stack Empty status: " + isEmpty);

	}
	
	// Method to Display Stack
	public void DisplayStack() {
		System.out.println("Stack contents: " + stack);
	}

}
