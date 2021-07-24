package exercises.array;

import java.util.ArrayList;

public class Test11 {

    public static void main(String[] args) {

        ArrayList<String> ss = new ArrayList<String>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("d");
        for (String s : ss) {
            if (s.equals("c")) s = "b";
            else if (s.equals("b")) s = "c";
        }
        for (String s : ss) System.out.println(s);
    }
}
