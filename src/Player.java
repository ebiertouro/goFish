package goFish;

import java.util.*;

public class Player {
	private String name;
	private List<Card> hand;
	
	public Player(String name) {
		this.name = name;
		hand = new ArrayList<Card>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void addToHand(Card card) {
		hand.add(card);
	}
	
	/*public void play() {    ???
		
	}*/
}
