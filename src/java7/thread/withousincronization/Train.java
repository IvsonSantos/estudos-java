package java7.thread.withousincronization;

class Train extends Thread {
	// reference to Line's Object.
	Line line;

	Train(Line line) {
		this.line = line;
	}

	@Override
	public void run() {
		line.getLine();
	}
}
