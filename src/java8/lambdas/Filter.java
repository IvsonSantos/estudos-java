package java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        List<Usuario> users = usuarios.stream().filter(u -> u.getPontos() > 120).collect(Collectors.toList());

        System.out.println(users);
    }
}
