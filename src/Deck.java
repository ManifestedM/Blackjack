import java.util.ArrayList;
import java.lang.Math;
public class Deck {
	ArrayList<Card> deck = new ArrayList();
	public void resetShoe(int decks) {
		while(decks>0) {
			String type = "Spades";
			for (int i = 2; i <= 10; i++) {
				deck.add(new Card(""+i, type));
			}
			deck.add(new Card("A",type));
			deck.add(new Card("J",type));
			deck.add(new Card("Q",type));
			deck.add(new Card("K",type));
			
			type = "Clubs";
			for (int i = 2; i <= 10; i++) {
				deck.add(new Card(""+i,type));
			}
			deck.add(new Card("A",type));
			deck.add(new Card("J",type));
			deck.add(new Card("Q",type));
			deck.add(new Card("K",type));
			
			type = "Diamonds";
			for (int i = 2; i <= 10; i++) {
				deck.add(new Card(""+i,type));
			}
			deck.add(new Card("A",type));
			deck.add(new Card("J",type));
			deck.add(new Card("Q",type));
			deck.add(new Card("K",type));
			
			type = "Hearts";
			for (int i = 2; i <= 10; i++) {
				deck.add (new Card(""+i,type));
			}
			deck.add(new Card("A",type));
			deck.add(new Card("J",type));
			deck.add(new Card("Q",type));
			deck.add(new Card("K",type));
			decks --;
		}
	}
	public ArrayList<Card> getCardList(){
		return deck;
	}
	public int getCardCount(){
		return deck.size();
	}
	public String getRandomCard() {
		int randomNum = (int)(Math.random()*deck.size()+.5);
		Card card = deck.get(randomNum);
		deck.remove(randomNum);
		return card.toString();
	}
}


