package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.implementation.IStackBridge;

interface IStacksFactory {

	IStackBridge getStandardStack();

	IStackBridge getFalseStack();

	StackFIFO getFIFOStack();

	StackHanoi getHanoiStack();

}
