public class BlackjackLogic{
	private int playerSum;
	private int dealerSum;
	private int playerCardCount;
	private int playerAceCount;
	public void proccessCardDealer(int cardValue){
			dealerSum+=cardValue;
	}
	public void proccessCardPlayer(int cardValue){
		if (cardValue == 11)
			playerAceCount++;
		else {
			playerSum +=cardValue;
			playerCardCount++;
		}
	}
	public int getPlayerSum() {
		return playerSum;
	}
	public int getDealerSum() {
		return playerSum;
	}
}
