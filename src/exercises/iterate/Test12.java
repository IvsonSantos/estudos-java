package exercises.iterate;

import java.util.Arrays;

public class Test12 {

    public static void main(String[] ar) {
        String[] args = {"a", "b","c", "d"};
        if (args.length < 10) {
                do {
                if (args.length > 2) return;
            } while (true);
        }
        System.out.println("finished");
    }
}
