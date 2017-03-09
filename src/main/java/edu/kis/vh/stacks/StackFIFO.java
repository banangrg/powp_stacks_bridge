package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	public Stack innerStack = new Stack();
	
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
