package cardGane.xdart;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
	private List<Player> playerListHaveCards;

	private List<Player> playerList;

	public PlayerManager() {
		this.playerList = new ArrayList<Player>();
	}

	public Player winer() {
		if (playerListHaveCards.get(0) != null) {
			Player winner = playerListHaveCards.get(0);
			for (int i = 0; i < playerListHaveCards.size() - 1; i++) {
				if (!cardManager.isAmorethanB(playerListHaveCards.get(i)
						.bigestCard(), playerListHaveCards.get(i + 1)
						.bigestCard()))
					winner = playerListHaveCards.get(i + 1);
			}
			return winner;
		}
		return null;
	}

	public void getCardList(List<Player> cardList) {
		this.playerListHaveCards = cardList;
	}

	public void addPlayer(String name) {
		playerList.add(new Player(name));
	}

	public void showPlayer() {
		for (int i = 0; i < playerList.size(); i++) {
			System.out.println("玩家名称：" + playerList.get(i).getName());
		}
	}

	public void showPlayerWithCards() {
		for (int i = 0; i < playerListHaveCards.size(); i++) {
			System.out.println("玩家:" + playerListHaveCards.get(i).getName()
					+ "\t" + "手牌: 【" + playerListHaveCards.get(i).showCards()
					+ "】" + "最大手牌:"
					+ playerListHaveCards.get(i).bigestCard().getColorName()
					+ playerListHaveCards.get(i).bigestCard().getNumber()
					);
		}
	}

	public List<Player> getPlayerList() {
		return playerList;
	}
}
