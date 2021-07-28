package exercises.math;

public class Test8 {

    public static void main(String[] args) {
        int m = 9, n = 1, x = 0;
        while (m > n) {
            m--;  // 6
            n += 2; // 7
            x += m + n; // 36
        }
        System.out.println(x);
    }
}
