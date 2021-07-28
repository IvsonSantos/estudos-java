package exercises.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        Set<String> valores = new HashSet<>();
        String s1 = "teste";
        String s2 = "teste";
        valores.add(s1);
        valores.add(s2);
        System.out.println(valores.size());

        List<String> lista = new ArrayList<>();
        lista.add(s1);
        lista.add(s2);
        System.out.println(lista.size());
    }
}
