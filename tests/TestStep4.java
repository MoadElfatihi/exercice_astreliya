import static org.junit.Assert.*;

import org.junit.Test;

import blackjack.Card;
import blackjack.Hand;
import blackjack.ICard;
import blackjack.IHand;

public class TestStep4 {

	@Test
	public void should_have_fifteen_when_cards_are_ten_and_four_and_ace() {
		ICard firstCard = new Card("10");
		ICard secondCard = new Card("4");
		ICard thirdCard = new Card("A");
		IHand hand = new Hand(firstCard, secondCard);

		hand.addCard(thirdCard);

		assertTrue(15 == hand.getPoints());
		assertFalse(hand.isBlackJack());
		assertFalse(hand.isBusted());
	}
//
//	@Test
//	public void should_have_twenty_two_and_busted_when_cards_are_ten_and_four_and_seven_and_ace() {
//		ICard firstCard = new Card("10");
//		ICard secondCard = new Card("4");
//		ICard thirdCard = new Card("7");
//		ICard fourthCard = new Card("A");
//		IHand hand = new Hand(firstCard, secondCard);
//
//		hand.addCard(thirdCard);
//		hand.addCard(fourthCard);
//
//		assertTrue(22 == hand.getPoints());
//		assertFalse(hand.isBlackJack());
//		assertTrue(hand.isBusted());
//	}
//
//	@Test
//	public void should_have_thirteen_when_cards_are_ace_and_ace_and_ace() {
//		ICard firstCard = new Card("A");
//		ICard secondCard = new Card("1");
//		ICard thirdCard = new Card("A");
//		IHand hand = new Hand(firstCard, secondCard);
//
//		hand.addCard(thirdCard);
//
//		assertTrue(13 == hand.getPoints());
//		assertFalse(hand.isBlackJack());
//		assertFalse(hand.isBusted());
//	}
//
//	@Test
//	public void should_have_fourteen_when_all_cards_are_aces() {
//		ICard firstCard = new Card("A");
//		ICard secondCard = new Card("1");
//		ICard thirdCard = new Card("1");
//		ICard lastCard = new Card("A");
//		IHand hand = new Hand(firstCard, secondCard);
//
//		hand.addCard(thirdCard);
//		hand.addCard(lastCard);
//
//		assertTrue(14 == hand.getPoints());
//		assertFalse(hand.isBlackJack());
//		assertFalse(hand.isBusted());
//	}
//
//	@Test
//	public void should_have_twelve_when_hand_already_contains_ace() {
//		ICard firstCard = new Card("A");
//		ICard secondCard = new Card("6");
//		ICard thirdCard = new Card("4");
//		ICard lastCard = new Card("A");
//		IHand hand = new Hand(firstCard, secondCard);
//
//		hand.addCard(thirdCard);
//		hand.addCard(lastCard);
//
//		assertTrue(12 == hand.getPoints());
//		assertFalse(hand.isBlackJack());
//		assertFalse(hand.isBusted());
//	}
}
