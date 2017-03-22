package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack implements IStackBridge {
	
	IStackBridge stackImpl;

	public Stack(IStackBridge stackImpl) {
		super();
		this.stackImpl = stackImpl;
	}
	
	public Stack() {
		this.stackImpl = new StackList();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackBridge#push(int)
	 */
	@Override
	public void push(int itemToPush) {
		stackImpl.push(itemToPush);
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackBridge#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return stackImpl.isEmpty();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackBridge#isFull()
	 */
	@Override
	public boolean isFull() {
		return stackImpl.isFull();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackBridge#getTop()
	 */
	@Override
	public int getTop() {
		return stackImpl.getTop();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStackBridge#pop()
	 */
	@Override
	public int pop() {
		return stackImpl.pop();
	}
	
	/*
	 * konsekwencjami "wyciagniecia" interfejsu jest to, ze w Stack mozemy korzystac
	 * z dowolnego sposobu implementacji stosu, dzieki czemu mozemy oddzielnie sie zajac abstrakcja
	 */
	

}
