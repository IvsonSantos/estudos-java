package exercises.iterate;

public class test17 {

    public static void main(String[] args) {

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        System.out.println(x + ", " + y + ", " + z);
    }
}
