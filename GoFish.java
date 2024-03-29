package goFish;
import java.util.List;

public class GoFish {
	interface Card {
		public String getRank();
		public String getSuit();
		public String toString();
	}
	
	interface Deck {
		public Card drawCard();
		public void shuffleDeck();
	}
	
	interface Player {
		public String getName();
		public List<Card> getHand();
		public void addToHand(Card card);
		public void play();
	}
	
	interface Game {
		public void startGame();
		public boolean isGameOver();
		public void playTurn(Player player);
		public void endGame();
	}
	
	interface GoFishGame extends Game {
		public void startGame();
		public boolean isGameOver();
		public void playTurn(Player player);
		public void endGame();
	}
}
