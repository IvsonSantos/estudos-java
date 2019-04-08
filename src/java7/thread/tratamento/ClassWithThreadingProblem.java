package java7.thread.tratamento;

public class ClassWithThreadingProblem {

	int nextId;
	
	public int getNetxId() {
		return nextId++;
	}
	
}
