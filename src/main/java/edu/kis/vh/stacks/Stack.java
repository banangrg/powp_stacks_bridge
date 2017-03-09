package edu.kis.vh.stacks;

public class Stack {
	
	private static final int EMPTY_STACK_INDICATOR = -1;
	private static final int FULL_STACK_INDICATOR = 11;

	private int[] stakcItems = new int[12];
	private int lastElementIndex = EMPTY_STACK_INDICATOR;

	public int getLastElementIndex() {
		return lastElementIndex;
	}

	public void push(int itemToPush) {
		if (!isFull())
			stakcItems[++lastElementIndex] = itemToPush;
	}

	public boolean isEmpty() {
		return lastElementIndex == EMPTY_STACK_INDICATOR;
	}

	public boolean isFull() {
		return lastElementIndex == FULL_STACK_INDICATOR;
	}

	public int getTop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return stakcItems[lastElementIndex];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return stakcItems[lastElementIndex--];
	}

}
