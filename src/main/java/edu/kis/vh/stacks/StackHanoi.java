package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.IStackBridge;

public class StackHanoi extends Stack {

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(IStackBridge stackImpl) {
		super(stackImpl);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = 0;
	
	/**
	 * returns how much elements weren't added to stack because they didn't fullfill the requirements
	 * @return number of rejected items
	 * modifies: nothing
	 */ 
	public int reportRejected() {
		return totalRejected;
	}
	
	/**
	 * checks if an item isn't empty and if it's smaller than the last one pushed, pushes the item on the top of the stack
	 * @param itemToPush an item which will be checked before push
	 * modifies: stackItems (base class field)
	 */ 

	@Override
	public void push(int itemToPush) {
		if (!isEmpty() && itemToPush >= getTop()) {
			totalRejected++;
		} else {
			super.push(itemToPush);
		}
	}

}
