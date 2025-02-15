package blackjack;

import java.util.ArrayList;
import java.util.List;

/*
 * Hand class handles the calculation of point as well as the state
 * of a BlackJack hand. It's always instantiated with 2 initial cards
 * of type ICard
 */
public class Hand implements IHand {
	private final List<ICard> cardList = new ArrayList<>();

	public Hand(ICard firstCard, ICard secondCard) {
		this.cardList.add(firstCard);
		this.cardList.add(secondCard);
	}
	/*
	* @args: ICard card we're adding
	* This method adds a card to our cardList ( aka our hand )
	 */
	public void addCard(ICard card) {
		this.cardList.add(card);
	}
	/*
	 * This method checks if our hand is Busted, meaning a game over.
	 * This condition satisfied when total points are above 21
	 */
	public boolean isBusted() {
		return ( getPoints()>21 );
	}
	/*
	 * @returns: boolean
	 * This method checks if our hand is a BlackJack, meaning we won!
	 * This condition satisfied when total points is 21 with
	 * only our starting cards
	 */
	public boolean isBlackJack() {
		return (this.cardList.size()==2 && getPoints()==21);
	}
	/*
	 * * @returns: int the points our hand is worth
	 * This method returns the total points our hand is worth while checking
	 * for A's. The rule is if you're busted and you got an A in you hand
	 * the A changes it's value from 1 to 11 while keeping the hand total
	 * point at the maximum. (example this hand: AAA is worth 11+1+1 = 13 )
	 */
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
	/*
	* @Args int sum: total points our hand is currently worth
	* @Arg int totalAs: total number of A's that still have their value at 11
	* This method uses recursivity to break down the sum and converting the A's
	* value at each step from 11 to 1.
	* This method will always yeild the maximum value for our hand since it uses
	* the minimal amount of A's needed
	 */
	public int recursiveSumBreaker(int sum,int totalAs){
		if (sum <=21 || totalAs ==0) return sum;
		// by removing 10 we essentially convert the value of A from 11 to 1
		return recursiveSumBreaker(sum-10, totalAs-1);
	}


}
