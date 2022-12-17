import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String decision, newGame;
		newGame = "y";
		double point; //temporary storage for how payout ratio to player
		double profit = 0; //total money gained/lost by player
		Scanner kBoard = new Scanner(System.in);
		Deck deck = new Deck();
		BlackjackLogic logic = new BlackjackLogic();
		deck.resetShoe(4);
		
		while(newGame.contains("y")) {
			logic.proccessCardDealer(deck.getRandomCard().toCardPoints());
			logic.proccessCardPlayer(deck.getRandomCard().toCardPoints());
			logic.proccessCardPlayer(deck.getRandomCard().toCardPoints());
			System.out.println(logic.getCurrentTotal());
			System.out.println("(H) hit or (S) stand?");
			decision = kBoard.next().toLowerCase();
			while (decision.contains("h") && logic.getDealerSum()+logic.getPlayerAces()<21) {
				logic.proccessCardPlayer(deck.getRandomCard().toCardPoints());
				System.out.println(logic.getCurrentTotal());
				System.out.println("(H) hit or (S) stand?");
				decision = kBoard.next().toLowerCase();
			}
			while (logic.getDealerMove() == true && !decision.contains("h")){
				logic.proccessCardDealer(deck.getRandomCard().toCardPoints());
				System.out.println(logic.getCurrentTotal());
			}
			point = logic.getWinner();
			profit += point;
			if (point == 1.5)
				System.out.print("Blackjack, Overall gain/loss $" + profit);
		else if (point ==1)
				System.out.print("Player Won, Overall gain/loss $" + profit);
			else if (point ==-1)
				System.out.print("Dealer Won, Overall gain/loss $" + profit);
			else
				System.out.print("Draw, Overall gain/loss $" + profit);
			logic.getCardCount(deck.getCardsInDeck());
			System.out.println(" Play Another Round (Y/N)");
			newGame = kBoard.next().toLowerCase();
			if (deck.getCardsInDeck()<20) {
				deck.resetShoe(4);
				logic.resetRunningCount();
			}
		}
	}
}
