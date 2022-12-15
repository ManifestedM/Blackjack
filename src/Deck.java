import java.util.ArrayList;
import java.lang.Math;
public class Deck {
	ArrayList<String> deck = new ArrayList();
	public void resetShoe(int decks) {
		while(decks>0) {
			String type = " Spades";
			for (int i = 2; i <= 10; i++) {
				deck.add(i + type);
			}
			deck.add("A"+type);
			deck.add("J"+type);
			deck.add("Q"+type);
			deck.add("K"+type);
			
			type = " Clubs";
			for (int i = 2; i <= 10; i++) {
				deck.add(i + type);
			}
			deck.add("A"+type);
			deck.add("J"+type);
			deck.add("Q"+type);
			deck.add("K"+type);
			
			type = " Diamonds";
			for (int i = 2; i <= 10; i++) {
				deck.add(i + type);
			}
			deck.add("A"+type);
			deck.add("J"+type);
			deck.add("Q"+type);
			deck.add("K"+type);
			
			type = " Hearts";
			for (int i = 2; i <= 10; i++) {
				deck.add(i + type);
			}
			deck.add("A"+type);
			deck.add("J"+type);
			deck.add("Q"+type);
			deck.add("K"+type);
			decks --;
		}
	}
	public ArrayList<String> getCardList(){
		return deck;
	}
	public int getCardCount(){
		return deck.size();
	}
	public String getRandomCard() {
		int randomNum = (int)(Math.random()*deck.size()+.5);
		String card = deck.get(randomNum);
		deck.remove(randomNum);
		return card;
	}
}


