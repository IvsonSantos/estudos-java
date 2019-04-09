package java8.functionalInterface;

/**
 * Podemos marcar uma interface como funcional explicitamente, para que o fato
 * de ela ser uma interface funcional não seja pela simples coincidência de ter
 * um único método.
 * 
 * @author ivsonhenrique
 * 
 *         Essa anotação serve apenas para que ninguém torne aquela interface em
 *         nãofuncional acidentalmente. Ela é opcional justamente para que as
 *         interfaces das antigas bibliotecas possamtambémser tratadas como
 *         lambdas, independente da anotação, bastando a existência de um único
 *         método abstrato.
 *
 */
@FunctionalInterface
public interface InterfaceDeclarada<T> {

	boolean valida(T t);

}
