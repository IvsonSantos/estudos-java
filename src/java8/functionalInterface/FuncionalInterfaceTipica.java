package java8.functionalInterface;

/**
 * Functional interfaces are also called Single Abstract Method interfaces (SAM Interfaces). 
 * As name suggest, they permit exactly one abstract method inside them. 
 * Java 8 introduces an annotation i.e. 
 * @FunctionalInterface which can be used for compiler level errors when the interface 
 * you have annotated violates the contracts of Functional Interface.
 */
@FunctionalInterface
public interface FuncionalInterfaceTipica {

	public void executa();
	
	// mesmo com os codigos abaixo ainda é uma INterface Funcional, pois estes veem da superclasse
	@Override
    public String toString();                //Overridden from Object class
 
    @Override
    public boolean equals(Object obj);        //Overridden from Object class
	
}