package java8.functionalInterface.explain;

public class Teste {

    public static void main(String[] args) {

        Validador<String> validaCEP = new Validador<String>() {
            @Override
            public boolean valida(String s) {
                return s.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        System.out.println(validaCEP.valida("50000-000"));
    }
}
