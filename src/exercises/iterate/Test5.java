package exercises.iterate;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("um");
        lista.add("dois");

        for (String item: lista) {
            item = null;
        }

        for (String item: lista) {
            System.out.println(item);
        }
    }
}
