package java8.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Supli {

    public static void main(String[] args) {

        Supplier<Usuario> criaSupplier = Usuario::new;
        Usuario novo = criaSupplier.get();

        Function<String, Usuario> criaFunction = Usuario::new;
        Usuario rodrigo = criaFunction.apply("Rodrigo Turini");

        BiFunction<String, Integer, Usuario> cria = Usuario::new;
        Usuario ivson = cria.apply("Ivson", 20);


    }
}
