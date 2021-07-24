package exercises.array;

import java.util.ArrayList;

public class Test8 {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();
        b.add("a");
        c.add("c");
        b.add("b");
        c.add("d");
        a.addAll(b);
        a.addAll(c);
        System.out.println(a.get(0));
        System.out.println(a.get(3));

    }
}
