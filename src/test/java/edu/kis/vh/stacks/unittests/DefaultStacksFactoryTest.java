package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class DefaultStacksFactoryTest {
	@Test public void testStandardStackFactory(){
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack result = factory.getStandardStack();
		Assert.assertTrue(result instanceof Stack);
	}
	
	@Test public void testFalseStackFactory(){
		testStandardStackFactory();
	}
	
	@Test public void testFIFOStackFactory(){
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack result = factory.getFIFOStack();
		Assert.assertTrue(result instanceof StackFIFO);
	}
	
	@Test public void testHanoiStackFactory(){
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack result = factory.getHanoiStack();
		Assert.assertTrue(result instanceof StackHanoi);
	}

}
