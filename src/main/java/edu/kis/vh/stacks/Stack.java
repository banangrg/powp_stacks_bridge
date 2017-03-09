package edu.kis.vh.stacks;

public class Stack {
	
	private static final int EMPTY_STACK_INDICATOR = -1;
	private static final int FULL_STACK_INDICATOR = 11;
	private static final int STACK_CAPACITY = 12;
	
//zaenkapsulowanie z opcja keep reference sprawia ze powstaja settery i gettery,z wewnatrz odwolania do pola zostaja
	private int[] stackItems = new int[STACK_CAPACITY];//ale na zewnatrz komunikacja odbywa sie przez settery i gettery
	private int lastElementIndex = EMPTY_STACK_INDICATOR;

	public int getLastElementIndex() {
		return lastElementIndex;
	}

	public void push(int itemToPush) {
		if (!isFull())
			stackItems[++lastElementIndex] = itemToPush; 
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
		return stackItems[lastElementIndex];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return stackItems[lastElementIndex--];
	}

}
