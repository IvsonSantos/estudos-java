package java8.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Example {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        Consumer<Usuario> msg = u -> System.out.println("before print");
        Consumer<Usuario> imprime = u -> System.out.println(u.getNome());

        usuarios.forEach(msg.andThen(imprime));


        //Para filtrar os 10 usuários commais pontos e torná-losmoderadores, podemos agora
        //fazer o seguinte código:
        usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
        usuarios.subList(0,10)
                .forEach(Usuario::tornaModerador);

    }
}
