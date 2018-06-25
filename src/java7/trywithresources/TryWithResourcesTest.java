package java7.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesTest {

	public static void main(String[] args) {

		// colocar os trys encadeados com ";"
		try (FileReader in = new FileReader("c:/ivson/teste.txt"); 
			 BufferedReader br = new BufferedReader(in)) {
			// TODO
		} catch (IOException iox) {
			System.out.println("Falha ao ler arquivo: " + iox.getMessage());
		}

	}

}
