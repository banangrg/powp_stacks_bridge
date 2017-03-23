package edu.kis.vh.stacks.unittests;



import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.implementation.StackList;

public class StackListTest {
	
	@Test
	public void testPush() {
		StackList stackObj = new StackList();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.getTop();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		StackList stackObj = new StackList();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(777);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		StackList stackObj = new StackList();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testTop() {
		StackList stackObj = new StackList();
		final int EMPTY_STACK_VALUE = 0;
		
		int result = stackObj.getTop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.getTop();
		Assert.assertEquals(testValue, result);
		result = stackObj.getTop();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		StackList stackObj = new StackList();
		final int EMPTY_STACK_VALUE = 0;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}