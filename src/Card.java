import java.awt.Image;
import java.lang.Integer;
public class Card {
	
	private String cardType;
	private String cardNumString;
	private int cardNum;
	public Card(String num, String type) {
		cardType = type;
		cardNumString = num;
	}
	public Card(int num, String type) {
		cardType = type;
		cardNum = num;
	}
	public String toString() {
		if (cardNum == 2 || cardNum == 3 || cardNum == 4 || cardNum == 5 || cardNum == 6 ||cardNum == 7 || cardNum == 8 || cardNum == 9 || cardNum == 10 )
			return (cardNum + " " + cardType);
		else
			return (cardNumString + " " + cardType);
	}
	public int toCardPoints() {
		if (cardNum == 2 || cardNum == 3 || cardNum == 4 || cardNum == 5 || cardNum == 6 ||cardNum == 7 || cardNum == 8 || cardNum == 9 || cardNum == 10 )
			return cardNum;
		else if (cardNumString.equals("A"))
			return 11;
		else return 10;
	}
}
