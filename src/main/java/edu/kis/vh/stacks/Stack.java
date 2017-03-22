package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {
	
	StackList stackImpl;

	public Stack(StackList stackImpl) {
		super();
		this.stackImpl = stackImpl;
	}
	
	public Stack() {
		this.stackImpl = new StackList();
	}

	public void push(int itemToPush) {
		stackImpl.pushElement(itemToPush);
	}

	public boolean isEmpty() {
		return stackImpl.isEmpty();
	}

	public boolean isFull() {
		return stackImpl.isFull();
	}

	public int getTop() {
		return stackImpl.peek();
	}

	public int pop() {
		return stackImpl.pop();
	}
	
	

}
