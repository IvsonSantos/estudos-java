package java7.thread.withsincronization;

public class Train extends Thread {
	// Reference variable of type Line.
	Line line;

	Train(Line line) {
		this.line = line;
	}

	@Override
	public void run() {
		line.getLine();
	}

}
