# Java-BlackJack
## Synopsis
This is a single player game of BlackJack. Uses as close to casino rule as I could configure.
## Why BlackJack?
Seemed like a good use of my current skill level in creating programs in Java. Writing this program helped to solidify my current knowledge of programming.

## How to play
Player begins play with $100, so long as the player has money the player may continue to play. The player may bet as much money as they have or less. The deck is shuffled for every round played. The Player and dealer are both dealt 2 cards, the dealer's first card is unknown. The player needs to get as close to 21 as possible without going over. The dealer will always draw another card so long as their hand is equal to or less than 17. If the player wishes to draw a card, for the first time in each hand they may double their bet, for every other card drawn after no other bet is made. If the player wins player gains 1.5% the bet made. If the player loses they lose their bet. Simple, right?

## Code Example
This bit of code allows the player to draw a card, checks whether there's an ace and if the player's hand is greater than 21. if it is that ace will equal 1.
'''
while (playertotal < 21) {
	System.out.println("Draw a card? (Y/N)");
	String drawcard = input.next()
	if (drawcard.equalsIgnoreCase("y")) {
		playersHand[pcount] = drawCard(shuffledDeck, card);
		playerHandValue[pcount] = drawCardValue(cardValue, card);
		playertotal = playerTotal(playerHandValue);
		pcount++;
		card++;
		playertotal = playerTotal(playerHandValue);
		if (checkPlayerTotal(playertotal) == true){
			for (int id = 0; id < dcount; id++){
			if (playersHand[id].contains("Ace") && playertotal > 21) {
				playerHandValue[id] = 1;
				playertotal = playerTotal(playerHandValue);
			}
		}														
	}
 '''
 '''
 **The method used to check the player's total.**
 '''
 public static int playerTotal(int[] playerHandValue) {
	int temp = 0;
	int var = 0;
	for (int i =0; i < playerHandValue.length; i++) {
		int playertotal = playerHandValue[i];
		temp = var + playertotal;
		var = temp;				
	}
	return var;
}
'''
  **and the method used to shuffle the deck.**
  '''
  public static String[] shuffleDeck(String[] deck) {
	boolean flag = false;
	String[] shuffledDeck = new String[52];	
	for (int i = 0; i < deck.length; i++){
		int index = (int)(Math.random() * deck.length);

		for (int a = 0; a < deck.length; a++){
			for (int b = 0; b < deck.length; b++){
				if (deck[a] == shuffledDeck[b]){
					flag = true;
				}
				if (!flag){
					shuffledDeck[i] = deck[index];
				}
				else{
					flag = false;
				}
			}
		}
	}			
	return shuffledDeck;
}
  '''
