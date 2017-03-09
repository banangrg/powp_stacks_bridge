package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public int reportRejected() {
		return getTotalRejected();
	}

	public void push(int itemToPush) {
		if (!isEmpty() && itemToPush > getTop()) {
			setTotalRejected(getTotalRejected() + 1);
		} else {
			super.push(itemToPush);
		}
	}

	private int getTotalRejected() {
		return totalRejected;
	}

	private void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
