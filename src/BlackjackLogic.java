public class BlackjackLogic{
	private int playerSum;
	private int dealerSum;
	private int playerCardCount;
	private int playerAceCount;
	
	public boolean getDealerMove() {
		if (dealerSum < 17)
			return true;
		else
			return false;
	}
	public void proccessCardDealer(int cardValue){
			dealerSum+=cardValue;
	}
	public void proccessCardPlayer(int cardValue){
		if (cardValue == 11)
			playerAceCount++;
		else {
			playerSum += cardValue;
			playerCardCount++;
		}
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
	public String getCurrentTotal() {
		return ("Player: " + playerSum + " " + playerAceCount + "A " + "Dealer:" + dealerSum);
	}
	public double getWinner() {
		double i;
		if (playerSum<22) {
			if (dealerSum<22) {
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
		else i = 0;
		
		playerSum = 0;
		dealerSum = 0;
		return i;
	}
}
