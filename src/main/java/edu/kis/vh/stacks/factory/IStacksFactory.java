package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

interface IStacksFactory {

	Stack getStandardStack();

	Stack getFalseStack();

	StackFIFO getFIFOStack();

	StackHanoi getHanoiStack();

}
