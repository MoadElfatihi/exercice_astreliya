import static org.junit.Assert.*;

import org.junit.Test;

import blackjack.Card;
import blackjack.Hand;
import blackjack.ICard;
import blackjack.IHand;

import java.util.ArrayList;
import java.util.List;

public class TestStep4 {

	@Test
	public void should_have_fifteen_when_cards_are_ten_and_four_and_ace() {
		ICard firstCard = new Card("10");
		ICard secondCard = new Card("4");
		ICard thirdCard = new Card("A");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		cardList.add(thirdCard);
		IHand hand = new Hand(cardList);
		
		assertTrue(15 == hand.getPoints());
		assertFalse(hand.isBlackJack());
		assertFalse(hand.isBusted());
	}
	
	@Test
	public void should_have_twenty_two_and_busted_when_cards_are_ten_and_four_and_seven_and_ace() {
		ICard firstCard = new Card("10");
		ICard secondCard = new Card("4");
		ICard thirdCard = new Card("7");
		ICard fourthCard = new Card("A");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		cardList.add(thirdCard);
		cardList.add(fourthCard);
		IHand hand = new Hand(cardList);
		
		assertTrue(22 == hand.getPoints());
		assertFalse(hand.isBlackJack());
		assertTrue(hand.isBusted());
	}
	
	@Test
	public void should_have_thirteen_when_cards_are_ace_and_ace_and_ace() {
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("1");
		ICard thirdCard = new Card("A");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		cardList.add(thirdCard);
		IHand hand = new Hand(cardList);
		
		assertTrue(13 == hand.getPoints());
		assertFalse(hand.isBlackJack());
		assertFalse(hand.isBusted());
	}
	
	@Test
	public void should_have_fourteen_when_all_cards_are_aces() {
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("1");
		ICard thirdCard = new Card("1");
		ICard lastCard = new Card("A");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		cardList.add(thirdCard);
		cardList.add(lastCard);
		IHand hand = new Hand(cardList);
		
		assertTrue(14 == hand.getPoints());
		assertFalse(hand.isBlackJack());
		assertFalse(hand.isBusted());
	}
	
	@Test
	public void should_have_twelve_when_hand_already_contains_ace() {
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("6");
		ICard thirdCard = new Card("4");
		ICard lastCard = new Card("A");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		cardList.add(thirdCard);
		cardList.add(lastCard);
		IHand hand = new Hand(cardList);
		
		assertTrue(12 == hand.getPoints());
		assertFalse(hand.isBlackJack());
		assertFalse(hand.isBusted());
	}
}
