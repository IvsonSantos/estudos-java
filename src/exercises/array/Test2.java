package exercises.array;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("certification");
        names.add("java");
        names.add("java");
        names.add("java");

        // tem que ser object
        Object lista[] = names.toArray();


        //String lista2[] = names.toArray();
        // para ser de String
        String lista2[] = names.toArray(new String[names.size()]);
    }
}
