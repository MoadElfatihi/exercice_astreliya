package blackjack;

public interface IHand {
	public void addCard(ICard card);
	
	public boolean isBusted();
	public boolean isBlackJack();
	public int getPoints();
}
