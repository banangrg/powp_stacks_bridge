package edu.kis.vh.stacks;

public class Stack {
	
	private IStackBridge StackImpl;
	
	public Stack() {
		StackImpl = new StackArray();
	}

	public Stack(IStackBridge stackImpl) {
		super();
		StackImpl = stackImpl;
	}

	public void push(int itemToPush) {
		StackImpl.push(itemToPush);
	}

	public boolean isEmpty() {
		return StackImpl.isEmpty();
	}

	public boolean isFull() {
		return StackImpl.isFull();
	}

	public int getTop() {
		return StackImpl.getTop();
	}

	public int pop() {
		return StackImpl.pop();
	}
	
	

}
