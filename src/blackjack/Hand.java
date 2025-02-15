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
		var sum = this.cardList.stream().mapToInt(card -> card.getPoints()).sum();
		if (sum <= 21) return sum;
		else {
			int totalAs = (int) this.cardList.stream()
					.filter(card -> card.getPoints() == 11)
					.count();
			return recursiveSumBreaker(sum, totalAs);
		}
	}
	public int recursiveSumBreaker(int sum,int totalAs){
		if (sum <=21 || totalAs ==0) return sum;
		return recursiveSumBreaker(sum-10, totalAs-1);
		// by removing 10 we essentially convert the value of A from 11 to 1
	}


}
