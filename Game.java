package goFish;
import java.util.*;

public class Game {
	protected List<Player> players = new ArrayList<Player>();
	protected Deck deck = new Deck();
	
	protected Game(List<Player> players) {
		this.players = players;
	}
	
	public void startGame() {
		// Ask player if wants to start
		System.out.println("Welcome to our game! Are you ready to start? (yes/no)");
		
		Scanner userInput = new Scanner(System.in);
		String response = userInput.nextLine();
		
		while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
			System.out.println("Invalid entry. Please try again:");
			response = userInput.nextLine();
		}
		
		if (response.equalsIgnoreCase("no")) {
			System.out.println("Too bad so sad");
			System.exit(0);
		}
		}
					
	
	/*public boolean isGameOver() {
		boolean over;
		
		if (player.getHand() == null)
			over = true;
		else if (deck.numOfCards() == 0)
			over = true;
		else over = false;

		return over;
		
	}*/
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