package java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Casa", "Papel", "Azul");
        Collections.sort(palavras);
        System.out.println(palavras);

        // palavras.sort(); nao compila
        palavras.sort(Comparator.naturalOrder());
    }
}
