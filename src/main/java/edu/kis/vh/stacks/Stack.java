package edu.kis.vh.stacks;

public class Stack {

	private int[] stakcItems = new int[12];

	public int lastElementIndex = -1;

	public void push(int itemToPush) {
		if (!isFull())
			stakcItems[++lastElementIndex] = itemToPush;
	}

	public boolean isEmpty() {
		return lastElementIndex == -1;
	}

	public boolean isFull() {
		return lastElementIndex == 11;
	}

	public int getTop() {
		if (isEmpty())
			return -1;
		return stakcItems[lastElementIndex];
	}

	public int pop() {
		if (isEmpty())
			return -1;
		return stakcItems[lastElementIndex--];
	}

}
