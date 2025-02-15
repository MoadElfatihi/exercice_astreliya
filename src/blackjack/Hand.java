package blackjack;

import org.apache.commons.lang.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Hand implements IHand {
	private final List<ICard> cardList = new ArrayList<>();

	public Hand(ICard firstCard, ICard secondCard) {
		this.cardList.add(firstCard);
		this.cardList.add(secondCard);
	}
	
	public void addCard(ICard card) {
		this.cardList.add(card);
	}

	public boolean isBusted() {
		throw new NotImplementedException();
	}

	public boolean isBlackJack() {
		throw new NotImplementedException();
	}

	public int getPoints() {
		return this.cardList.stream().mapToInt(card->card.getPoints()).sum();
	}

}
