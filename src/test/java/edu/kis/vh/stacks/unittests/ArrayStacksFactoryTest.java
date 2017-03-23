package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.implementation.IStackBridge;

public class ArrayStacksFactoryTest {
	@Test public void testStandardStackFactory(){
		ArrayStacksFactory factory = new ArrayStacksFactory();
		IStackBridge result = factory.getStandardStack();
		Assert.assertTrue(result instanceof Stack);
	}
	
	@Test public void testFalseStackFactory(){
		testStandardStackFactory();
	}
	
	@Test public void testFIFOStackFactory(){
		ArrayStacksFactory factory = new ArrayStacksFactory();
		IStackBridge result = factory.getFIFOStack();
		Assert.assertTrue(result instanceof StackFIFO);
	}
	
	@Test public void testHanoiStackFactory(){
		ArrayStacksFactory factory = new ArrayStacksFactory();
		IStackBridge result = factory.getHanoiStack();
		Assert.assertTrue(result instanceof StackHanoi);
	}

}
