import static org.junit.Assert.*;

import org.junit.Test;

import blackjack.Card;
import blackjack.Hand;
import blackjack.ICard;
import blackjack.IHand;

public class TestStep3 {

	@Test
	public void should_have_blackjack_when_cards_are_ace_and_ten() {
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("10");
		IHand hand = new Hand(firstCard, secondCard);
		
		assertTrue(21 == hand.getPoints());
		assertTrue(hand.isBlackJack());
		assertFalse(hand.isBusted());
	}
	
	@Test
	public void should_not_have_blackjack_when_cards_are_ace_and_six_and_four() {
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("6");
		ICard thirdCard = new Card("4");
		IHand hand = new Hand(firstCard, secondCard);
		
		hand.addCard(thirdCard);
		
		assertTrue(21 == hand.getPoints());
		assertFalse(hand.isBlackJack());
		assertFalse(hand.isBusted());
	}
	
	@Test
	public void should_not_have_blackjack_when_cards_are_ace_and_eight() {
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("8");
		IHand hand = new Hand(firstCard, secondCard);
		
		assertTrue(19 == hand.getPoints());
		assertFalse(hand.isBlackJack());
		assertFalse(hand.isBusted());
	}
	
	@Test
	public void should_be_busted_when_score_goes_above_21() {
		ICard firstCard = new Card("10");
		ICard secondCard = new Card("J");
		ICard thirdCard = new Card("2");
		IHand hand = new Hand(firstCard, secondCard);
		
		hand.addCard(thirdCard);
		
		assertFalse(hand.isBlackJack());
		assertTrue(hand.isBusted());
	}
	
}
