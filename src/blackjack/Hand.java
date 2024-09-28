package blackjack;

import org.apache.commons.lang.NotImplementedException;

public class Hand implements IHand {

	private ICard firstCard;
	private ICard secondCard;
	private ICard thirdCard;
	
	public Hand(ICard firstCard, ICard secondCard) {
		this.firstCard = firstCard;
		this.secondCard = secondCard;
		this.thirdCard = new Card("0");
	}
	
	public void addCard(ICard card) {
		this.thirdCard = card;
	}

	public boolean isBusted() {
		throw new NotImplementedException();
	}

	public boolean isBlackJack() {
		throw new NotImplementedException();
	}

	public int getPoints() {
		return firstCard.getPoints() + secondCard.getPoints() + thirdCard.getPoints();
	}

}
