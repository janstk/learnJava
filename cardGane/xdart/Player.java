package cardGane.xdart;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String nameString;
	private List<Card> handCards;

	public Player(String name) {
		this.nameString = name;
		handCards = new ArrayList<Card>();
	}

	public String showCards() {
		StringBuilder cardString = new StringBuilder();
		for (int i = 0; i < handCards.size(); i++) {
			cardString.append(handCards.get(i).getColorName() +handCards.get(i).getNumber() +" ");
		}
		return cardString.toString();
	}

	public String getName() {
		return nameString;
	}

	public void addCard(Card card) {
		handCards.add(card);
	}
	
	public void showHandsCard() {
		for (int i = 0; i < handCards.size(); i++) {
			System.out.println(handCards.get(i).getNumber()  + handCards.get(i).getColorName());
		}
	}

	public Card bigestCard() {
		if (handCards.size() == 0)
			return null;
		else if (handCards.size()==1) {
			return handCards.get(0);
		}
		Card big = handCards.get(0);
		for (int i = 0; i < handCards.size()-1; i++) {
			if (cardManager
					.isAmorethanB(handCards.get(i+1), handCards.get(i))) {
					big = handCards.get(i+1);
			}
		}
		return big;
	}
}
