package java8.functionalInterface;

public interface Defaulable {

	// Interfaces now allow default methods, the implementer may or
	// may not implement (override) them.
	default String notRequired() {
		return "Default implementation";
	}
}
