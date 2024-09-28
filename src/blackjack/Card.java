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
		if (this.value.equals("A")) {
			return 11;
		}

		return Integer.parseInt(this.value);
	}

}
