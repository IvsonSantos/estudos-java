package java7.repeticao;

public class SomaDois {

    public static void main(String[] args) {
        int total = 0;

        for (int i = 0; i <= 20; i += 2) {
            total += i;
        }

        System.out.printf("Sum is %d%n", total);
    }

}
