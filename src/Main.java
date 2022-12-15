
public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.resetShoe(1);
		System.out.println(deck.getRandomCard());
		System.out.println(deck.getCardList());
		
	}

}
