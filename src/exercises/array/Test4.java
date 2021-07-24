package exercises.array;

import java.util.ArrayList;

public class Test4 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("guilherme");
        names.add("mario");
        names.add("paulo");
        names.add("mauricio");
        names.add("adriano");
        names.add("alberto");
        names.add("mario");
        System.out.println(names.indexOf("guilherme")); // 0
        System.out.println(names.indexOf("mario")); // 1
        System.out.println(names.indexOf("john")); // -1
        System.out.println(names.lastIndexOf("mario")); // 6
        System.out.println(names.lastIndexOf("john")); // -1
    }
}
