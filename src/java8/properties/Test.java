package java8.properties;

public class Test {

    public static void main(String[] args) {
        String user = System.getProperty("user.name");
        System.out.println(user);

        String userHome = System.getProperty("user.home");
        System.out.println(userHome);

        String compName = System.getenv("PATH");
        System.out.println(compName);
    }
}
