import static org.junit.Assert.assertTrue;

import org.junit.Test;

import blackjack.Card;
import blackjack.ICard;

public class TestStep1 {

	@Test
	public void should_value_two_when_card_displays_two() {
		ICard card = new Card("2");
		
		assertTrue(2 == card.getPoints());
	}
	
	@Test
	public void should_value_seven_when_card_displays_seven() {
		ICard card = new Card("7");
		
		assertTrue(7 == card.getPoints());
	}
	
	@Test
	public void should_value_ten_when_card_displays_ten() {
		ICard card = new Card("10");
		
		assertTrue(10 == card.getPoints());
	}
	
	@Test
	public void should_value_ten_when_card_displays_king() {
		ICard card = new Card("K");
		
		assertTrue(10 == card.getPoints());
	}
	
	@Test
	public void should_value_eleven_when_card_displays_ace() {
		ICard card = new Card("A");
		
		assertTrue(11 == card.getPoints());
	}
	
	@Test
	public void should_value_eleven_when_card_displays_one() {
		ICard card = new Card("1");
		
		assertTrue(11 == card.getPoints());
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_arguments_when_card_unknown() {
		ICard card = new Card("R");
		
		assertTrue(10 == card.getPoints());
		
	}
}
