package blackjack;

import org.apache.commons.lang.NotImplementedException;

import java.util.ArrayList;

public class Hand implements IHand {

	private static final int BLACK_VALUE_VALUE = 21;

	private final ArrayList<ICard> cards = new ArrayList<>();
	
	public Hand(ICard firstCard, ICard secondCard) {
		this.cards.add(firstCard);
		this.cards.add(secondCard);
	}
	
	public void addCard(ICard card) {
		// Card must not be null
		this.cards.add(card);
	}

	public boolean isBusted() {
		return BLACK_VALUE_VALUE < this.getPoints();
	}

	public boolean isBlackJack() {
		return this.cards.size() == 2
				&& BLACK_VALUE_VALUE == this.getPoints();
	}

	public int getPoints() {
		return this.cards.stream()
				.map(ICard::getPoints)
				.mapToInt(value -> value)
				.sum();
	}
}
