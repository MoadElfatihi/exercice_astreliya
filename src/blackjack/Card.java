package blackjack;

public class Card implements ICard {
	private String value;
	public Card(String value) {
		this.value=value;
	}
	
	public int getPoints() {
		if (value.matches("[J|Q|K]")) return 10;
		else if (value.matches("A|1")) return 11;
		else return Integer.parseInt(value);// add try catch if necessary
	}
	public String getValue(){
		return value;
	}

}
