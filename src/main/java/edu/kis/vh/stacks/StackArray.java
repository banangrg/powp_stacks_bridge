package edu.kis.vh.stacks;

public class StackArray implements IStackBridge{
	
	private static final int EMPTY_STACK_INDICATOR = -1;
	private static final int STACK_CAPACITY = 12;
	
//zaenkapsulowanie z opcja keep reference sprawia ze powstaja settery i gettery,z wewnatrz odwolania do pola zostaja
	private int[] stackItems = new int[STACK_CAPACITY];//ale na zewnatrz komunikacja odbywa sie przez settery i gettery
	private int lastElementIndex = EMPTY_STACK_INDICATOR;

	private int getLastElementIndex() {
		return lastElementIndex;
	}

	@Override
	public void push(int itemToPush) {
		if (!isFull())
			stackItems[++lastElementIndex] = itemToPush; 
	}

	@Override
	public boolean isEmpty() {
		return getLastElementIndex() == EMPTY_STACK_INDICATOR;
	}

	@Override
	public boolean isFull() {
		return getLastElementIndex() == STACK_CAPACITY - 1;
	}

	//TODO: Exception handling
	@Override
	public int getTop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return stackItems[lastElementIndex];
	}

	//TODO: Exception handling
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return stackItems[lastElementIndex--];
	}

}
