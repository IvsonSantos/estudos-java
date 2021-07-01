package java8.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {

        Map<String, Integer> lista = new HashMap<>();

        lista.put("a", 1);
        lista.put("b", 2);
        lista.put(null, 3);

        // difference between both
        lista.put(null, 3);
        lista.putIfAbsent(null, 4);

        System.out.println(lista);
    }
}
