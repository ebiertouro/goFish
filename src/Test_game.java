package goFish;

import java.util.*;

public class Test_game {
	public static void main(String[] args) {
		// create Scanner, list of players, deck, and game
		Scanner input = new Scanner(System.in);
		List<Player> players = new ArrayList<Player>();
		Deck deck = new Deck();
		List<Card> discard = new ArrayList<Card>();
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
		
		boolean cont = false;
		while (cont == false) {
			System.out.println("set/ask"); // clarify
			String action = input.nextLine();
			
			// input validation
			while (!action.equalsIgnoreCase("set") && !action.equalsIgnoreCase("ask")) {
				System.out.println("Not a valid option. Please type \"set\" or \"ask\"");
				action = input.nextLine();
			}
			
			if (action.equalsIgnoreCase("set")) {
				System.out.println("Enter the 4 numbers of the cards in the set, one at a time");
				
				// display hand?
				
				int[] setNumbers = new int[4];
				for (int num=1; num<=4; num++) {
					System.out.print(num + ": ");
					setNumbers[num-1] = input.nextInt(); 
				}
				
				// check if 4 cards selected make a set
				Card[] set = checkSet(player1, setNumbers);
				
				if (set != null) {
					System.out.println("You have a set!");
					
					// discard set
					for (Card card : set) {
						player1.removeFromHand(card);
						discard.add(card);
					}
					
				} else {
					System.out.println("Those cards do not make a set");

				}
	
			}else {
				// ask code
			}
			
		} // end while
	} 
	
	public static Card[] checkSet(Player player, int[] setNumbers) {
		Card card1 = player.getHand().get(setNumbers[0]-1);
		Card card2 = player.getHand().get(setNumbers[1]-1);
		Card card3 = player.getHand().get(setNumbers[2]-1);
		Card card4 = player.getHand().get(setNumbers[3]-1);
						
		// check if ranks are the same
		if (card1.getRank() == card2.getRank()
			&& card2.getRank() == card3.getRank()
			&& card3.getRank() == card4.getRank()) {
			
			Card [] set = {card1, card2, card3, card4};
			return set;
		} 
		
		return null;
	}
}
