package exercises.math;

public class Test2 {

    public static void main(String[] args) {
        /*
        int x = 0;
        long y = 10;
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }



        for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " ");
        }
        */



        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        // System.out.print(x); // DOES NOT COMPILE
    }
}
