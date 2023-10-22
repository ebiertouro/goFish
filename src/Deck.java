package goFish;
import java.util.*;
import java.lang.Math;

public class Deck {
	private List<Card> cards;
	private int cardCount = 0;
	
	// enum? private?
	String[] suits = {"spades", "hearts", "diamonds",
	"clubs" };
	String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", 
		"8", "9", "10", "Jack", "Queen", "King" };

	
	public Deck () {		
		cards = new ArrayList<Card>();
		for (String suit : suits) {
			for (String rank : ranks) {
				Card newCard = new Card(rank, suit);
				cards.add(newCard);
				cardCount += 1;		
			}
		}
	}
	
	public Card drawCard() {
		if (cardCount == 0) {
			return null;
		}
		Card drawnCard = cards.get(0);
		cards.remove(0);
		cardCount --;
		return drawnCard;
	}
	
	// return card?
	
	public int numOfCards() {
		return this.cardCount;
	}
	
	public void shuffleDeck() {
		Collections.shuffle(cards);
		
	}
}
