package edu.kis.vh.stacks.implementation;

public class StackList implements IStackBridge {

	Node last;
	
	
	//TODO: unused "i" variable
	int i;

	@Override
	public void push(int item) {
		if (last == null)
			last = new Node(item);
		else {
			last.next = new Node(item);
			//TODO: line below is  redundant, left and right is exactly the same
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int getTop() {
		if (isEmpty())
			return IStackBridge.EMPTY_STACK_INDICATOR;
		return last.getNodeValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return IStackBridge.EMPTY_STACK_INDICATOR;
		int returnValue = last.getNodeValue();
		last = last.prev;
		return returnValue;
	}
	
	/*
	 * przy zaagregowaniu StackList w Stack, uzylem opcji Change Method Signature
	 *  aby dopasowac metody do interfejsu klasy Stack
	 */

}
