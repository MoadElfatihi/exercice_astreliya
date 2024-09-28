package blackjack;

import org.apache.commons.lang.NotImplementedException;

public class Hand implements IHand {

	private ICard firstCard;
	private ICard secondCard;
	
	public Hand(ICard firstCard, ICard secondCard) {
		this.firstCard = firstCard;
		this.secondCard = secondCard;
	}
	
	public void addCard(ICard card) {
		throw new NotImplementedException();
	}

	public boolean isBusted() {
		throw new NotImplementedException();
	}

	public boolean isBlackJack() {
		throw new NotImplementedException();
	}

	public int getPoints() {
		return firstCard.getPoints() + secondCard.getPoints();
	}

}
