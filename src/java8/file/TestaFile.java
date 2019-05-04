package java8.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestaFile {

	public static void main(String[] args) throws IOException {

		//Path path = Paths.get("/home/ivsonhenrique/file-ivson.txt");
		Path path = Paths.get("file-ivson.txt");

		List<String> linhasDoArquivo = Files.readAllLines(path);

		for (String linha : linhasDoArquivo) {
			System.out.println(linha);
		}
		
		
		
		// mais facil
		
		Files.lines(path).forEach(System.out::println);
		
	}
}
