package java8.functionalInterface.explain;

@FunctionalInterface
public interface Validador<T> {

    boolean valida(T t);

}
