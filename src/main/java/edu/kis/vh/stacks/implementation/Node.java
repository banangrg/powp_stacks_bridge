package edu.kis.vh.stacks.implementation;

class Node {

	private int nodeValue;
	public Node prev, next;

	public Node(int value) {
		nodeValue = value;
	}

	public int getNodeValue() {
		return nodeValue;
	}
	
}
