package blackjack;

public class Card implements ICard {

	private final String value;

	public Card(String value) {
		this.value = value;
	}
	
	public int getPoints() {
		return Integer.parseInt(this.value);
	}

}
