package blackjack;

public class Card implements ICard {
	private final String value;

	public Card(String value) {
		this.value = value;
	}
	
	public int getPoints() {
		if("K".equals(this.value)){
			return 10;
		}
		else if("A".equals(this.value) || "1".equals(this.value)){
			return 11;
		}

		final int valueToNumber = convertToNumber(value);
		if(valueToNumber>1 && valueToNumber<11){
			return valueToNumber;
		}

		throw new IllegalArgumentException("unknown value");
	}

	private int convertToNumber(String value){
		try {
			final int i = Integer.parseInt(value);
			return i;
		} catch(NumberFormatException e){
			throw new IllegalArgumentException();
		}
	}
}
