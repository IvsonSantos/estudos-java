package exercises.iterate;

public class Test4 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; System.out.println(i++)) { // bizarro code

        }

        for (;;) {
            System.out.println("Infinito");
        }

        //

    }

    void a() {
        // pode declarar 2 variaveis mas devem ser do mesmo tipo
        for (int i =1, j = 2; true; i++) {

        }
    }
}

