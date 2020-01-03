package java7.prova;

/*
class MultiClasse {

	 public static void main(String[] args) {
		 ArrayList<String> existing = new ArrayList<String>();
	
		 for (String arg : args) {
		 if (new E().exists(arg))
		 existing.add(arg);
		 }
	 }
}
*/
import java.io.File;

class E {
	public boolean exists(String name) {
		File f = new File(name);
		return f.exists();
	}
}
