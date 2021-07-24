package exercises.array;

import java.util.ArrayList;
import java.util.Iterator;

public class Test10 {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "b");
        a.add(0, "a");
        for (Iterator<String> i = a.iterator(); i.hasNext(); i.next()) {
            String element = i.next();
            System.out.println(element);
        }
    }
}
