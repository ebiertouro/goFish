package goFish;

import java.util.*;

public class Test_game {
	public static void main(String[] args) {
		// craete Scanner, list of players, deck, and game
		Scanner input = new Scanner(System.in);
		List<Player> players = new ArrayList<Player>();
		Deck deck = new Deck();
		Game game = new Game(players);
		
		// Start game
		game.startGame();
		
		// Create 2 players (human and computer)
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		Player player1 = new Player(name);
		Player player2 = new Player("Computer");
		
		// Instantiate player list and add 2 players
		players.add(player1);
		players.add(player2);
		
		// shuffle deck
		deck.shuffleDeck();
					
		// distribute 7 cards to each player
		for (Player player : players) {
			for (int i = 0; i < 7; i++) {
				Card drawnCard = deck.drawCard();
				player.addToHand(drawnCard);
			}
		}
		
		/*
		// test set checker (comment out the above for loop to test)
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "spade");
		Card card3 = new Card("3", "hearts");
		Card card4 = new Card("3", "diamonds");
		Card card5 = new Card("3", "clubs");
		
		player1.addToHand(card1);
		player1.addToHand(card2);
		player1.addToHand(card3);
		player1.addToHand(card4);
		player1.addToHand(card5);
		*/
		
		// Read out hand to player
		System.out.println(player1.getName() + ", " + "your cards are:");
		int cardCounter = 0;
		for (Card card : player1.getHand()) {
			cardCounter ++;
			System.out.println(cardCounter + ". " + card.toString());
		}
		
		
		System.out.println("\nYou will go first\n");  // create y/n method?
		
		boolean cont = true;
		while (cont = false) {
			System.out.println("(set/ask)");
			String action = input.nextLine();
			
			//validation
			
			if (action.equalsIgnoreCase("set")) {
				System.out.println("Enter the 4 numbers of the cards in the set, one at a time");
				// display hand?
				int[] setNumbers = new int[4];
				for (int num=1; num<=4; num++) {
					System.out.print(num + ": ");
					setNumbers[num-1] = input.nextInt(); 
				}
				
				// check if ranks are the same
				if (player1.getHand().get(setNumbers[0]-1).getRank() 
					== player1.getHand().get(setNumbers[1]-1).getRank()
					&&
					player1.getHand().get(setNumbers[1]-1).getRank()
					== player1.getHand().get(setNumbers[2]-1).getRank()
					&&
					player1.getHand().get(setNumbers[2]-1).getRank()
					== player1.getHand().get(setNumbers[3]-1).getRank()
					) {
					System.out.println("You have a set!");
					// not done!
					// If yes, all 4 to discard pile
					cont = true;
					
				} else {
					System.out.println("Those cards do not make a set");
				}
	
			}else if (action.equalsIgnoreCase("ask")) {
				// ask code
			} else {
				// validation here or before.
			}
			
		} // end while
	} 
}
