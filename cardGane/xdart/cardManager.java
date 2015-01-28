package cardGane.xdart;

import java.util.ArrayList;
import java.util.List;

public class cardManager {

	private List<Card> listcCards;

	public cardManager() {
		listcCards = new ArrayList<Card>();
		generateNumList();
	}

	public void generateNumList() {
		for (int i = 1; i < 14; i++) {
			for (int j = 1; j < 5; j++) {
				Card tmpcard = new Card(i, j);
				this.listcCards.add(tmpcard);
			}
		}

	}

	public static boolean isAmorethanB(Card a, Card b) {
		if (a.getPoint() > b.getPoint()) 
			return true;
		if (a.getPoint() == b.getPoint()) 
		{
			if (a.getColor() > b.getColor()) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	public void showCard() {
		for (Card c : listcCards) {
			System.out.print(c.getColorName() + c.getNumber() + "\t ");
		}
	}
	public List<Player>  cardGame(List<Player> playerlist, int cardCount) //��playerlist �е���ҷ���
	{
		List<Player> players = playerlist;
		if (cardCount * players.size() > listcCards.size()) { //������������Ļ�...
			return null;
		}
		int i = listcCards.size();
		List<Card>tmpCards = new ArrayList<Card>(listcCards);
		for (int j = 0; j < cardCount; j++) {
			for (int k = 0; k < playerlist.size(); k++) {
				if(i-->0)
				{
					int numTmp = (int) Math.round(Math.random() * (tmpCards.size() - 1) + 1);
					Card tmpCard = tmpCards.get(numTmp);
					players.get(k).addCard(tmpCard);
					System.out.println(
							"��ң�"+players.get(k).getName()+
							" ��ȡ��" + tmpCard.getColorName() + tmpCard.getNumber()
							);
					tmpCards.remove(numTmp);
				}
			}
			
		}
		
		return players;
	}
}
