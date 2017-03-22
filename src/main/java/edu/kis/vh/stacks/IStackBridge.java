package edu.kis.vh.stacks;

public interface IStackBridge {

	void push(int itemToPush);

	boolean isEmpty();

	boolean isFull();

	int getTop();

	int pop();

}