package exercises.iterate;

import java.util.HashMap;
import java.util.Iterator;

public class IterateTest {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("Japan", "Tokio");
        map.put("France", "Paris");
        map.put("Russia", "Moscou");

        System.out.println("Test");
        Iterator<String> countryIterator = map.keySet().iterator();
        while (countryIterator.hasNext()) {
            String country = countryIterator.next();
            map.put("Nepal", "Katmandu");
            System.out.println(country);
        }
        System.out.println("---------");

    }
}
