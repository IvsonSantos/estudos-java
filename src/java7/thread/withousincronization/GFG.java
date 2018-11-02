package java7.thread.withousincronization;

public class GFG {

	public static void main(String[] args) {
		// Object of Line class that is shared
		// among the threads.
		Line obj = new Line();

		// creating the threads that are
		// sharing the same Object.
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);

		// threads start their execution.
		train1.start();
		train2.start();
	}
}
