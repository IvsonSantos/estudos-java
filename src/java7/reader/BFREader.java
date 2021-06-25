package java7.reader;

import java.io.*;

public class BFREader {

    static void writeDataSameLine(String[] data) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String d : data) {
                bw.write(d);
            }
        }
    }

    static void writeDataNewLIne(String[] data) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String d : data) {
                bw.write(d);
                bw.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String[] data = {"Line1", "Line 2", "Line 3"};
        BFREader.writeDataNewLIne(data);
        BFREader.readData();
    }

    static void readData() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String value;
            while ((value = br.readLine()) != null) {
                System.out.println(value);
            }
        }
    }
}
