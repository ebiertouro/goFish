package ourGoFish;
import java.util.*;

public class OurGoFishGame extends OurGame {
	private final List<Player> players = new List<Player>();
	private final Deck deck = new Deck();
	
	@Override
	public void startGame() {
		
		//this is the only different line. do i need to override the whole method?
		System.out.println("Welcome to our Go Fish game! Are you ready to start?");
		Scanner userInput = new Scanner(System.in);
		String response = userInput.nextLine();
		
		while (response != "yes".toUpperCase() && response != "no".toUpperCase()) {
			System.out.println("Invalid entry. Please try again.");
			System.out.println("Welcome to our game! Are you ready to start?");
			response = userInput.nextLine();
			
		if (response == "yes".toUpperCase()) {
			deck.Shuffle();
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
		boolean over = false;
		if (player's score > 1)
			over = true;
		return over;
		
	}
	
	@Override
	public void playTurn(Player) {
		/*
		 * view the deck
		 * chose card to ask
		 * ask another player
		 * if (has card)
		 * 		i get the card - added to my deck - subtract from his deck
		 * 		check if i have a suit
		 * 		if (suit)
		 * 			put it down - subtract
		 * 			isGameOver();
		 * else (go fish)
		 * 		chose new card - from deck
		 * 		end turn
		 * 		playTurn(computer/human)
		 */
	}
	
	public void endGame() {
		
	}
}
