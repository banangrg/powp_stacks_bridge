package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.IStackBridge;
import edu.kis.vh.stacks.implementation.StackArray;

public class StackFIFO extends Stack {

	//TODO: Exception handling
	//TODO: maybe a Deque will be faster and simpler
	
	private IStackBridge innerStack = new StackArray();
	
	
	
	
	public StackFIFO() {
		super();
	}



	public StackFIFO(IStackBridge stackImpl) {
		super(stackImpl);
	}

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

	
