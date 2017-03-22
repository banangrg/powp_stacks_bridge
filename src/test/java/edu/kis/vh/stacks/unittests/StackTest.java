package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.implementation.StackArray;

public class StackTest {
	
	//bledow nie zauwazylem gdyz przed kazdym commitem sprawdzalem czy testy przechodza
	
	@Test
	public void testPush() {
		StackArray stackObj = new StackArray();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.getTop();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		StackArray stackObj = new StackArray();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		StackArray stackObj = new StackArray();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		StackArray stackObj = new StackArray();
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
		StackArray stackObj = new StackArray();
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
