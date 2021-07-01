package java8.properties;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadXML {

    public static void main(String[] args) {
        Properties p = new Properties();

        try (InputStream in = Files.newInputStream(Paths.get("props.xml"))) {
            p.loadFromXML(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String v1 = p.getProperty("name");
        System.out.println(v1);
    }
}
