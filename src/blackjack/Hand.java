package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand implements IHand {

	private static final int BLACK_JACK_VALUE = 21;

	private final ArrayList<ICard> cards = new ArrayList<>();

	private List<ICard> cardList = new ArrayList<>();

	public Hand(List<ICard> cardList) {
		this.cardList = cardList;
	}

	public void addCard(ICard card) {
		this.cardList.add(card);
	}

	public boolean isBusted() {
		return getPoints() > BLACK_JACK_VALUE;
	}

	public boolean isBlackJack() {
		return getPoints() == BLACK_JACK_VALUE && cardList.size() == 2;
	}

	public int getPoints() {
		//faisable avec un stream map etc
		int total = 0;
		for (ICard card : cardList) {
			total += card.getPoints();
			//mettre les as à la fin de la main ?
			if (total > BLACK_JACK_VALUE && (this.getValues().contains("A") || this.getValues().contains("1"))) {
				total -= 10;
			}
		}

		return total;
	}

	public List<String> getValues() {

		List<String> values = new ArrayList<>();

		for (ICard card : this.cardList) {
			values.add(card.getValue());
		}
		return values;
	}

}
