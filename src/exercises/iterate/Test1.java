package exercises.iterate;

public class Test1 {

    int a() {
        while (true) { // true, true, true ...
            System.out.println("do something");
        }
        //return 1; // compile error o compilador sabe que este loop é infinito
    }

    int b() {
        final boolean RUNNING = true;
        while(RUNNING) { // true, true, true ...
            System.out.println("do something");
        }
        // return 1; // compile error mesma coisa, o compilador sabe pois é FINAL
    }

    int c() {
        boolean RUNNING = true;
        while(RUNNING) { // true, true, true ...
            System.out.println("do something");
        }
        return 1; // a variavel nao é final entao pode ser alterada e nao da erro aqui
    }
}
