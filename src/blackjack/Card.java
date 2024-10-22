package blackjack;

public class Card implements ICard {

	// Value must have a value
	private final String value;
	public Card(String value) {
		this.value = value;
	}
	
	public int getPoints() {
		int points = 0;
		switch (this.value) {
			case "J":
			case "Q":
			case "K":
				points = 10;
				break;
			case "1":
			case "A":
				points = 11;
				break;
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
				points = Integer.parseInt(this.value);
				break;
			default:
				throw new IllegalArgumentException("Invalid card");
		}
		return points;
	}
}
