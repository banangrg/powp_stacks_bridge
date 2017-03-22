package edu.kis.vh.stacks.list;

public class StackList {

	private static final int EMPTY_STACK_INDICATOR = -1;
	
	Node last;
	
	//TODO: unused "i" variable
	int i;

	public void pushElement(int item) {
		if (last == null)
			last = new Node(item);
		else {
			last.next = new Node(item);
			//TODO: line below is  redundant, left and right is exactly the same
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peek() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return last.getNodeValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		int returnValue = last.getNodeValue();
		last = last.prev;
		return returnValue;
	}

}
