package java8.string;

import java.util.StringJoiner;

public class SJtest {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ");
        sj.add("alpha").add("theta").add("gama");
        String res = sj.toString();
        System.out.println(res);

        sj = new StringJoiner(", ", "{", "}");
        sj.add("alpha").add("theta").add("gama");
        res = sj.toString();
        System.out.println(res);
    }
}
