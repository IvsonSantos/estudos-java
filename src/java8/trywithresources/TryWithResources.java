package java8.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Novo do Java 7
 * @author ivson.santos
 *
 */
public class TryWithResources {

	public static void main(String[] args) {

		// colocar os trys encadeados com ";"
		try (FileReader in = new FileReader("c:/ivson/teste.txt"); BufferedReader br = new BufferedReader(in)) {
			// todo
		} catch (IOException iox) {
			System.out.println("Falha ao ler arquivo: " + iox.getMessage());
		}

	}
}
