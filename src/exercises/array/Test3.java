package exercises.array;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("java");
        names.set(0, "certification");
        System.out.println(names.get(0)); // certification
        System.out.println(names.size()); // 1
    }
}
