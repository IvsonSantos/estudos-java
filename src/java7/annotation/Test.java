package java7.annotation;

@Worker(useThis = false)
public class Test {

    public static void main(String[] args) throws Exception {

        Class<?> type = Class.forName("Worker");
        Worker test = type.getAnnotation(Worker.class);

        if (test == null) {
            throw new Exception("null");
        }

        if (test.useThis()) {
            System.out.println("Teste é ok");
        } else {
            System.out.println("Teste é falso");
        }

    }

}
