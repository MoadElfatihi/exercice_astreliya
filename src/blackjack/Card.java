package blackjack;

public class Card implements ICard {

	private final String value;

	public Card(String value) {
		this.value = value;
	}
	
	public int getPoints() {
		if (this.value.equals("K") || this.value.equals("J")) {
			return 10;
		}
		if (isAce()) {
			return 11;
		}

		return Integer.parseInt(this.value);
	}

	private boolean isAce() {
		return this.value.equals("A") || this.value.equals("1");
	}

}
