package edu.kis.vh.stacks.implementation;

public interface IStackBridge {

	/*
	 *  wyciagniecie stalej statycznej do interfejsu pozwolilo na zmiane jej wartosci w jednym miejscu
	 */
	int EMPTY_STACK_INDICATOR = 0;

	void push(int itemToPush);

	boolean isEmpty();

	boolean isFull();

	int getTop();

	int pop();

}