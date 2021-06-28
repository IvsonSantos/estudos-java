package java8.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NewBFReader {

    static void readDate() throws IOException {
        try (BufferedReader br = Files.newBufferedReader(Paths.get("data.txt"))) {
            String value;
            while ((value = br.readLine()) != null) {
                System.out.println(value);
            }
        }
    }

    static void readAllLines() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("data.txt"));
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException  {
        NewBFReader.readAllLines();
    }
}
