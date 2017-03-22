package edu.kis.vh.stacks;

public class Stack {
	
	StackArray stackArray;

	public Stack(StackArray stackArray) {
		super();
		this.stackArray = stackArray;
	}
	
	public Stack() {
		this.stackArray = new StackArray();
	}

	public void push(int itemToPush) {
		stackArray.push(itemToPush);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int getTop() {
		return stackArray.getTop();
	}

	public int pop() {
		return stackArray.pop();
	}
	
	

}
