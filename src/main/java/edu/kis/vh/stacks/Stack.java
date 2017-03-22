package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.IStackBridge;
import edu.kis.vh.stacks.implementation.StackArray;

public class Stack {
	
	IStackBridge stackImpl;

	public Stack(IStackBridge stackImpl) {
		super();
		this.stackImpl = stackImpl;
	}
	
	public Stack() {
		this.stackImpl = new StackArray();
	}

	public void push(int itemToPush) {
		stackImpl.push(itemToPush);
	}

	public boolean isEmpty() {
		return stackImpl.isEmpty();
	}

	public boolean isFull() {
		return stackImpl.isFull();
	}

	public int getTop() {
		return stackImpl.getTop();
	}

	public int pop() {
		return stackImpl.pop();
	}
	
	/*
	 * konsekwencjami "wyciagniecia" interfejsu jest to, ze w Stack mozemy korzystac
	 * z dowolnego sposobu implementacji stosu, dzieki czemu mozemy oddzielnie sie zajac abstrakcja
	 * 
	 * f3 przenosi nas do deklaracji (niekoniecznie do definicji)
	 * ctrl+t / ctrl + klik , pozwala nam wybrac otworzenie deklaracji lub iplementacji
	 */
	

}
