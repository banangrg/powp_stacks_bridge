package edu.kis.vh.stacks.list;

public class Node {

	private int nodeValue;
	public Node prev, next;

	public Node(int value) {
		nodeValue = value;
	}

	public int getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}
	
}
