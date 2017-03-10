package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

public class StackFIFOTest {

	@Test public void testPop(){
		DefaultStacksFactory factory = new DefaultStacksFactory();
		StackFIFO fifoStack = factory.getFIFOStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = fifoStack.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int item = 5, item2 = 10;
		fifoStack.push(item);
		fifoStack.push(item2);
		
		result = fifoStack.pop();
		Assert.assertEquals(item, result);
		
		result = fifoStack.pop();
		Assert.assertEquals(item2, result);
	}
}
