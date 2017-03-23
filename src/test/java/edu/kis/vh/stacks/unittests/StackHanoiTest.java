package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;


import org.junit.Test;

public class StackHanoiTest {

	@Test public void testPop() {

		DefaultStacksFactory factory = new DefaultStacksFactory();
		StackHanoi hanoiStack = factory.getHanoiStack();
		final int EMPTY_STACK_VALUE = 0;
		
		int item = 7, item2 = 8, item3 = 2;
		
		hanoiStack.push(item);
		hanoiStack.push(item2);
		hanoiStack.push(item3);

		
		int result = hanoiStack.pop();
		Assert.assertEquals(item3, result);
		
		result = hanoiStack.pop();
		Assert.assertEquals(item, result);
	}
	
	@Test public void testTotalRejected() {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		StackHanoi hanoiStack = factory.getHanoiStack();
		final int EMPTY_STACK_VALUE = 0;
		
		int item = 7, item2 = 8, item3 = 2, item4 = 2;
		hanoiStack.push(item);
		hanoiStack.push(item2);
		hanoiStack.push(item3);
		hanoiStack.push(item4);
		
		hanoiStack.reportRejected();
		Assert.assertEquals(hanoiStack.reportRejected(), 2);
		
	}
		

}
