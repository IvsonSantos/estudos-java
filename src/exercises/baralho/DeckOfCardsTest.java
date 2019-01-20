package exercises.baralho;

public class DeckOfCardsTest {

	public static void main(String[] args) {

		DeckOfCards myDeck = new DeckOfCards();
		myDeck.shuffle(); // coloca Cards em ordem aleatória

		// imprime todas as 52 cartas na ordem em que elas são distribuídas
		for (int i = 0; i < 52; i++) {
			// distribui e exibe uma Card
			System.out.printf("%-19s", myDeck.dealCard());

			if (i % 4 == 0) // gera uma nova linha após cada quarta carta
				System.out.println();

		}
	}

}
