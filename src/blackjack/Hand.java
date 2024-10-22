package blackjack;

import org.apache.commons.lang.NotImplementedException;

import java.util.ArrayList;

public class Hand implements IHand {

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
		throw new NotImplementedException();
	}

	public boolean isBlackJack() {
		throw new NotImplementedException();
	}

	public int getPoints() {
		return this.cards.stream()
				.map(ICard::getPoints)
				.mapToInt(value -> value)
				.sum();
	}
}
