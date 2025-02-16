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
		if(card != null){
			int sum = firstCard.getPoints()+card.getPoints();
			this.firstCard = new Card(sum+"");
		}

	}

	public boolean isBusted() {
		return this.getPoints()>21;
	}

	public boolean isBlackJack() {
		return this.getPoints()==21 && this.firstCard.getValue().equals("A");
	}

	public int getPoints() {
		return firstCard.getPoints() + secondCard.getPoints();
	}

}
