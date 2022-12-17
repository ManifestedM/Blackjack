public class BlackjackLogic{
	private int playerSum;
	private int dealerSum;
	private int playerCardCount;
	private int playerAceCount;
	private int runningCount = 0;
	
	public boolean getDealerMove() {
		if (dealerSum < 17)
			return true;
		else
			return false;
	}
	public void proccessCardDealer(int cardValue){
			dealerSum+=cardValue;
			if (cardValue < 6)
				runningCount ++;
			else if (cardValue == 10)
				runningCount --;
	}
	public void proccessCardPlayer(int cardValue){
		if (cardValue == 11)
			playerAceCount++;
		else {
			playerSum += cardValue;
			playerCardCount++;
		}
		if (cardValue < 6)
			runningCount ++;
		else if (cardValue == 10)
			runningCount --;
	}
	public int getPlayerSum() {
		return playerSum;
	}
	public int getPlayerAces() {
		return playerAceCount;
	}
	public int getDealerSum() {
		return playerSum;
	}
	public void getCardCount(int cardsInDeck) {
		System.out.println(" Running Count: " + runningCount + " True Count: " + runningCount/(cardsInDeck/52));
	}
	public void resetRunningCount() {
		runningCount = 0;
	}
	public String getCurrentTotal() {
		return ("Player: " + playerSum + " " + playerAceCount + "A " + "Dealer:" + dealerSum);
	}
	public double getWinner() {
		double i;
		if (playerSum + playerAceCount < 11) //code to proccess aces correctly
			playerSum += 10 + playerAceCount;
		else
			playerSum += playerAceCount;
		if (playerSum < 22) {
			if (dealerSum < 22) {
				if (playerSum == 21 && playerCardCount == 2)
					i = 1.5;
				else if (playerSum == dealerSum)
					i = 0;
				else if (playerSum>dealerSum)
					i = 1;
				else 
					i = -1;
			}
			else if (playerSum == 21 && playerCardCount == 2)
				i=1.5;
			else
				i = 1;
		}
		else i = -1;
		
		playerSum = 0;
		dealerSum = 0;
		return i;
	}
}
