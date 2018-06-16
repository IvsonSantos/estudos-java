package arquivo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaSaida {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("caelum");
		bw.close();

		// forms muito mais facil
		Scanner scanner = new Scanner(System.in);
		PrintStream ps = new PrintStream("arquivo.txt");
		while (scanner.hasNextLine()) {
			ps.println(scanner.nextLine());
		}
		scanner.close();
		ps.close();
	}
}
