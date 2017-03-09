package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		testStacks(factory);

	}

	private static void testStacks(DefaultStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		fillStacks(stacks);

		fillHanoiStack(stacks[3]);

		printStacksContent(stacks);

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

	private static void printStacksContent(Stack[] stacks) {
		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}
	}

	private static void fillHanoiStack(Stack stack) {
		java.util.Random rn = new java.util.Random();
		
		for (int i = 1; i < 15; i++)
			stack.push(rn.nextInt(20));
	}

	private static void fillStacks(Stack[] stacks) {
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