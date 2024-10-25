import static org.junit.Assert.*;

import org.junit.Test;

import blackjack.Card;
import blackjack.Hand;
import blackjack.ICard;
import blackjack.IHand;

import java.util.ArrayList;
import java.util.List;

public class TestStep2 {

	@Test
	public void should_have_four_points_when_cards_are_two_and_two() {
		ICard firstCard = new Card("2");
		ICard secondCard = new Card("2");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		IHand hand = new Hand(cardList);
	}
	
	@Test
	public void should_have_fourteen_points_when_cards_are_eight_and_six() {
		ICard firstCard = new Card("8");
		ICard secondCard = new Card("6");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		IHand hand = new Hand(cardList);
		
		assertTrue(14 == hand.getPoints());
	}

	@Test
	public void should_have_nineteen_points_when_cards_are_eight_and_six_and_five() {
		ICard firstCard = new Card("8");
		ICard secondCard = new Card("6");
		ICard thirdCard = new Card("5");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		cardList.add(thirdCard);
		IHand hand = new Hand(cardList);
		
		assertTrue(19 == hand.getPoints());
	}
	
	@Test
	public void should_have_seventeen_points_when_cards_are_four_and_five_and_two_and_six() {
		ICard firstCard = new Card("4");
		ICard secondCard = new Card("5");
		ICard thirdCard = new Card("2");
		ICard fourthCard = new Card("6");
		List<ICard> cardList = new ArrayList<>();
		cardList.add(firstCard);
		cardList.add(secondCard);
		cardList.add(thirdCard);
		cardList.add(fourthCard);
		IHand hand = new Hand(cardList);
		
		assertTrue(17 == hand.getPoints());
	}
}
