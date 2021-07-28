package exercises.iterate;

public class Test16 {

    public static void main(String[] args) {
        int x = 4;
        long y = x * 4 - x++;
        if (y < 10) System.out.println("Too Low");
        else System.out.println("Just right");
        // else System.out.println("Too High");

        int a = 3;
        System.out.println(a > 2 ? a < 4 ? 10 : 8 : 7);
    }
}
