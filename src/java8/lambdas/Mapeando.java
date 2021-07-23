package java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapeando {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        List<Integer> pontos = new ArrayList<>();
        usuarios.forEach(u -> pontos.add(u.getPontos()));

        List<Integer> pontos2 = usuarios.stream()
                .map(u -> u.getPontos())
                .collect(Collectors.toList());

        List<Integer> pontos3 = usuarios.stream()
                .map(Usuario::getPontos)
                .collect(Collectors.toList());
    }
}
