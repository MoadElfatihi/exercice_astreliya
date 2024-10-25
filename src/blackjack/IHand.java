package blackjack;

import java.util.List;

public interface IHand {
	public void addCard(ICard card);
	
	public boolean isBusted();
	public boolean isBlackJack();
	public int getPoints();

	public List<String> getValues();
}
