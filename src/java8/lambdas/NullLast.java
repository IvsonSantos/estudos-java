package java8.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NullLast {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = null;
        Usuario user3 = null;
        Usuario user4 = new Usuario("Rodrigo Turini", 120);
        Usuario user5 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4, user5);

        usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome)));
        System.out.println(usuarios);

        usuarios.sort(Comparator.nullsFirst(Comparator.comparing(Usuario::getNome)));
        System.out.println(usuarios);

        /*
        usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
         */

    }
}
