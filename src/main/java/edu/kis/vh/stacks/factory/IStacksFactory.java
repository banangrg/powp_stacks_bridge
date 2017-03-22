package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.IStackBridge;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

interface IStacksFactory {

	IStackBridge getStandardStack();

	IStackBridge getFalseStack();

	StackFIFO getFIFOStack();

	StackHanoi getHanoiStack();

}
