package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void push(int itemToPush) {
		if (!isEmpty() && itemToPush > getTop()) {
			totalRejected++;
		} else {
			super.push(itemToPush);
		}
	}
}
