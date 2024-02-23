import java.util.Random;
public class ShuffleCards {
	public static void main ( String[] args){
		final String[] CARD_TYPES = {"2","3","4","5","6","7", "8","9","10","Jack","Queen","King","Ace"};
		final String[] SUIT_TYPES = {"Hearts", "Diamonds", "Spades", "Clubs"};
		final int CARDS_IN_DECK = CARD_TYPES.length * SUIT_TYPES.length;
		
		int[][] deck = new int[CARDS_IN_DECK][2];
		for (int card = 0; card < CARDS_IN_DECK; card++)
		{
			deck[card][0] = card % CARD_TYPES.length;
			deck[card][1] = card / CARD_TYPES.length;
		}
		Random generator = new  Random();
		
		for (int index = 0; index < deck.length; index++)
		{
			int otherIndex = generator.nextInt(deck.length);
			int[] temp = deck[index]; 		// take in an entire row, make a copy of that entire row
			deck[index] = deck[otherIndex]; // change that row
			deck[otherIndex] = temp;		// resigning the other row to be my temporary row;
		}
		
		final String[][]CARD = new String[SUIT_TYPES.length][CARD_TYPES.length];
		
		for(int suitType = 0; suitType < SUIT_TYPES.length; suitType++)
		{
			for (int cardType = 0; cardType < CARD_TYPES.length; cardType++)
			{
				CARD[suitType][cardType] = SUIT_TYPES[suitType] + "_" + CARD_TYPES[cardType];
				System.out.println(CARD[suitType][cardType]);
			}
		}
			
	}
	
}
