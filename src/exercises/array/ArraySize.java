package exercises.array;

import java.util.ArrayList;
import java.util.List;

public class ArraySize {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>(2);
		
		lista.add("a");
		lista.add("b");
		lista.add("c");
		
		System.out.println("Tamanho do array é: " + lista.size());
	}

}
