import java.awt.Image;

public class Card {
	private String cardType;
	private String cardNum;
	public Card(String num, String type) {
		cardType = type;
		cardNum = num;
	}
	public String toString() {
		return (cardNum + " " + cardType);
	}
}
