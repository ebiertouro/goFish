package ourGoFish;
import java.util.*;

public class OurGame {
	protected List<Player> players = new List<Player>();
	protected Deck deck;
	
	protected OurGame(List<Player> players) {
		this.players = players;
	}
	
	public void startGame() {
		
		System.out.println("Welcome to our game! Are you ready to start?");
		Scanner userInput = new Scanner(System.in);
		String response = userInput.nextLine();
		
		while (response != "yes".toUpperCase() && response != "no".toUpperCase()) {
			System.out.println("Invalid entry. Please try again.");
			System.out.println("Welcome to our game! Are you ready to start?");
			response = userInput.nextLine();
			
		if (response == "yes".toUpperCase()) {
			deck.shuffleDeck();
			
			for (Player player : players) {
		for (int i = 0; i < 7; i++) {
			  deck.drawCard();
			}
		}
			for(Player player : players) {
				playTurn(player);
			}
		}
		
		if (response == "no".toUpperCase()) {
			endGame();
			}
		}
					
	}
	public boolean isGameOver() {
		boolean over;
		
		if (player.getHand() == null)
			over = true;
		else if (deck.numOfCards() == 0)
			over = true;
		else over = false;

		return over;
		
	}
	public void playTurn(Player player) {
		
		System.out.println("Enter 0 to draw a card from the "
				+ "deck, 1 to put down a card, and 2 to view your hand.");
		
		Scanner userInput = new Scanner(System.in);
		int choice = userInput.nextInt();
		
		if (choice == 0) {
			
		}
		
		else if (choice == 1) {
			
		}
		
		else if (choice == 2) {
			
		}
		
	}
	public void endGame() {
		//determine winner
		//display results
		System.out.println("I hope you enjoyed playing our game! Goodbye.");
		
	}	
}