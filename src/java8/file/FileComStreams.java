package java8.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileComStreams {
	
	public static void main(String[] args) throws IOException {
		
		// ler os arquivos
		Files.list(Paths.get("./java8")).forEach(System.out::println);
		
		// ler apenas os arquivos java
		Files.list(Paths.get("./br/com/java8"))
			.filter(p -> p.toString().endsWith(".java"))
			.forEach(System.out::println);
		
			
	}

}
