package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.implementation.IStackBridge;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements IStacksFactory {

	@Override
	public IStackBridge getStandardStack() {
		return new Stack();
	}

	@Override
	public IStackBridge getFalseStack() {
		return new Stack();
	}

	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
