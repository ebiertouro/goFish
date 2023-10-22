package goFish;

public class Card {
	private String rank;
	private String suit;
	
	// Constructor
	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	// Get methods
	public String getRank() {
		return this.rank;
	}

	public String getSuit() {
		return this.suit;
	}
	
	// toString 
	// ???????? @override  ???
	public String toString() {
		return "Rank: " + this.rank + "\nSuit: " + this.suit;
	}
}
