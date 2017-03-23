package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.implementation.IStackBridge;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		ListStacksFactory listStacksFactory = new ListStacksFactory();
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();


		testStacks(factory);
		testStacks(listStacksFactory);
		testStacks(arrayStacksFactory);

	}

	private static void testStacks(IStacksFactory factory) {
		IStackBridge[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		fillStacks(stacks);

		fillHanoiStack(stacks[3]);

		printStacksContent(stacks);

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

	private static void printStacksContent(IStackBridge[] stacks) {
		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
	}

	private static void fillHanoiStack(IStackBridge stack) {
		java.util.Random rn = new java.util.Random();
		
		for (int i = 1; i < 15; i++)
			stack.push(rn.nextInt(20));
	}

	private static void fillStacks(IStackBridge[] stacks) {
		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);
		}
	}

}

// 3.1.1 zle sformatowane
// stack: wszystkie metody poczawszy od push, nieprawidlowe wciecia
// StackFIFO: brak wciec do linijek dotyczacych petli while
// StackHanoi: brak wciec w metodach reportRejected i push

//3.1.3 alt + <- / -> pozwala przemieszczac sie pomiedzy otwartymi plikami projektu