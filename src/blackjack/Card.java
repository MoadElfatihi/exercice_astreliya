package blackjack;

public class Card implements ICard {

	private final String value;

	public Card(String value) {
		this.value = value;
	}
	
	public int getPoints() {
		if (this.value.equals("K")) {
			return 10;
		}
		return Integer.parseInt(this.value);
	}

}
