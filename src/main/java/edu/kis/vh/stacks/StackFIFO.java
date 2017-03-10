package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	
	private Stack innerStack = new Stack();
	
	//TODO: Exception handling
	//TODO: maybe a Deque will be faster and simpler
	@Override
	public int pop() {
		while (!isEmpty()) {
			innerStack.push(super.pop());
		}
		
		int returnValue = innerStack.pop();
		
		while (!innerStack.isEmpty()) {
			push(innerStack.pop());
		}

		return returnValue;
	}
}
