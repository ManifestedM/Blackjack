
public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		BlackjackLogic logic = new BlackjackLogic();
		deck.resetShoe(1);
		Card s = deck.getRandomCard();
		logic.proccessCardPlayer(s.toCardPoints());
		int i = logic.getPlayerSum();
		System.out.println(i);
		
	}

}
