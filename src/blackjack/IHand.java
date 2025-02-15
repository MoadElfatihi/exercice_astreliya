package blackjack;

public interface IHand {
	void addCard(ICard card);
	boolean isBusted();
	boolean isBlackJack();
	int getPoints();
}
