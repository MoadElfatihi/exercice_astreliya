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
		return this.getPoints() > 21;
	}

	public boolean isBlackJack() {
		return this.cards.size() == 2 && this.getPoints() == 21;
	}

	public int getPoints() {
		int total = 0;
		for (ICard card : this.cards) {
			total += card.getPoints();
		}
		return total;
	}

}
