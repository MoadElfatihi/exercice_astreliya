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
		return ( getPoints()>21 );
	}

	public boolean isBlackJack() {
		return (this.cardList.size()==2 && getPoints()==21);
	}

	public int getPoints() {
		return this.cardList.stream().mapToInt(card->card.getPoints()).sum();
	}

}
