package exercises.math;

public class Test1 {

    public static void main(String[] args) {
        // long x = 10;
        // int y = 5;
        // y = y * x; // DOES NOT COMPILE

        long x = 10;
        int y = 5;
        y *= x;
        // The compound operator will fi rst cast x to a long, apply the multiplication of two long values

        long a = 5;
        long b = (a=3);
        System.out.println(a); // Outputs 3
        System.out.println(b); // Also, outputs 3
    }
}
