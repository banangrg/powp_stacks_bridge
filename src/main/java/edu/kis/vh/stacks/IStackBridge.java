package edu.kis.vh.stacks;

public interface IStackBridge {
	
	public void push(int itemToPush);
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public int getTop();
	
	public int pop();
}
