package blackjack;

import org.apache.commons.lang.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Hand implements IHand {

	private final List<ICard> cards = new ArrayList<>();
	
	public Hand(ICard firstCard, ICard secondCard) {
		this.cards.add(firstCard);
		this.cards.add(secondCard);
	}
	
	public void addCard(ICard card) {
		this.cards.add(card);
	}

	public boolean isBusted() {
		throw new NotImplementedException();
	}

	public boolean isBlackJack() {
		throw new NotImplementedException();
	}

	public int getPoints() {
		int total = 0;
		for (ICard card : this.cards) {
			total += card.getPoints();
		}
		return total;
	}

}
