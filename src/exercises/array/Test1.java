package exercises.array;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("certification");
        names.add("java");
        names.add("java");
        names.add("java");

        System.out.println(names.contains("java")); // true
        System.out.println(names.contains("c#")); // false
// true, encontrado e removido
        boolean removed = names.remove("java");
        System.out.println(names.contains("java")); // false - true pois so remove a primeira ocorrencia
        System.out.println(names.contains("c#")); // false
    }
}
