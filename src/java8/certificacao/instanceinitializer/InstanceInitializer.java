package java8.certificacao.instanceinitializer;

public class InstanceInitializer {

    private String name = "Ivson";

    // instant initializer
    {
        System.out.println("Iniciando");
    }

    public InstanceInitializer() {
        name = "Alterado";
        System.out.println("Construtor");
    }

    public static void main(String[] args) {
        InstanceInitializer i = new InstanceInitializer();
        System.out.println(i.name);
    }
}
