package exercises.baralho;

import java.security.SecureRandom;

public class DeckOfCards {

	private Card[] deck;
	private int currentCard; // indice da proxima carta a ser distribuida (0-51)
	private static final int NUMERO_DE_CARTAS = 52;
	private static final SecureRandom randomNumbers = new SecureRandom(); // gerador de n�mero aleat�rio

	// preenche o baralho de cartas
	public DeckOfCards() {
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		deck = new Card[NUMERO_DE_CARTAS];
		currentCard = 0; // a primeira carta distribuida

		// preenche baralho com objetos Card
		for (int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
	}

	// embaralha as cartas com um algoritmo de uma passagem
	public void shuffle() {

		// a pr�xima chamada para o m�todo dealCard deve come�ar no deck[0] novamente
		currentCard = 0;

		// para cada Card, seleciona outra Card aleat�ria (0-51) e as compara
		for (int primeiro = 0; primeiro < deck.length; primeiro++) {
			int segundo = randomNumbers.nextInt(NUMERO_DE_CARTAS);

			// compara Card atual com Card aleatoriamente selecionada
			Card temp = deck[primeiro];
			deck[primeiro] = deck[segundo];
			deck[segundo] = temp;
		}
	}

	// distribui uam carta
	public Card dealCard() {
		// determina se ainda h� Cards a serem distribu�das
		if (currentCard < deck.length) {
			return deck[currentCard++]; // retorna Card atual no array
		} else {
			return null;
		}
	}

}
