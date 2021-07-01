package java8.properties;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class TestXML {

    public static void main(String[] args) {
        Properties p = new Properties();

        p.setProperty("name", "ivson");
        p.setProperty("number", "123");

        try (OutputStream out = Files.newOutputStream(Paths.get("props.xml"))) {
            p.storeToXML(out, "My");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
