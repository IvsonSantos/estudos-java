package exercises.baralho;

public class Card {

	private final String face; 	// as, copas...
	private final String naipe; // coracao, diamante...
	
	public Card(String face, String naipe) {
		this.face = face;
		this.naipe = naipe;
	}
	
	@Override
	public String toString() {
		return face + " de " + naipe;
	}
	
}