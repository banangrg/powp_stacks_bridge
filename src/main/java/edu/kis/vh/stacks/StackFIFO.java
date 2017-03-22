package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.IStackBridge;
import edu.kis.vh.stacks.implementation.StackList;

public class StackFIFO extends Stack {

	//TODO: Exception handling
	//TODO: maybe a Deque will be faster and simpler
	
	private IStackBridge innerStack = new StackList();
	//wydaje mi sie ze implementacja w postaci listy bedzie lepsze bo mozna przerobic potem kod tak zeby nie "wywracac"
	//co chwile stosu a zamieniac po prostu tyl z przodem na chwilke i tyle
	
	
	public StackFIFO() {
		super(new StackList());
	}



	public StackFIFO(IStackBridge stackImpl) {
		super(stackImpl);
	}

	@Override
	public int pop() {
		while (!isEmpty()) {
			innerStack.push(super.pop());
		}
		
		int returnValue = innerStack.pop();
		
		while (!innerStack.isEmpty()) {
			push(innerStack.pop());
		}

		return returnValue;
	}
}

	
