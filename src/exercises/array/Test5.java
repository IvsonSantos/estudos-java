package exercises.array;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
        c.add("a");
        c.add("c");
        System.out.println(c.remove("a"));

        ArrayList<String> d = new ArrayList<String>();
        d.add("a");
        d.add("c");
        System.out.println(d.remove("a"));


        ArrayList<String> e = new ArrayList<String>();
         e.add("a");
         e.add("a");
         System.out.println(e.remove("a"));
         System.out.println(e.size());
    }
}
