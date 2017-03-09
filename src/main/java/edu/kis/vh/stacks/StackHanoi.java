package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int itemToPush) {
		if (!isEmpty() && itemToPush > getTop()) {
			totalRejected++;
		} else {
			super.push(itemToPush);
		}
	}

}
