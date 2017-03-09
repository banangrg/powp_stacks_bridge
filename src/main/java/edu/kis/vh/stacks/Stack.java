package edu.kis.vh.stacks;

public class Stack {
	
	private static final int EMPTY_STACK_INDICATOR = -1;
	private static final int FULL_STACK_INDICATOR = 11;

	private int[] stackItems = new int[12];
	private int lastElementIndex = EMPTY_STACK_INDICATOR;

	public int getLastElementIndex() {
		return lastElementIndex;
	}

	public void push(int itemToPush) {
		if (!isFull())
			getStackItems()[++lastElementIndex] = itemToPush; //uzycie getterow zamiast bezposredniego odwolania do pola
	}

	public boolean isEmpty() {
		return getLastElementIndex() == EMPTY_STACK_INDICATOR;
	}

	public boolean isFull() {
		return getLastElementIndex() == FULL_STACK_INDICATOR;
	}

	public int getTop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return getStackItems()[lastElementIndex];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return getStackItems()[lastElementIndex--];
	}

	private int[] getStackItems() {
		return stackItems;
	}

	private void setStackItems(int[] stackItems) {
		this.stackItems = stackItems;
	}

}
