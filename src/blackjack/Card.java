package blackjack;

public class Card implements ICard {
	String value;
	public Card(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public int getPoints() {
		if (value.equals("J") || value.equals("Q") || value.equals("K")) {
			return 10;
		}
		if (value.equals("A") || value.equals("1")) {
			return 11;
		}
		return Integer.parseInt(value);
	}

}
