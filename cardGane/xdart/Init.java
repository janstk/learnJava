package cardGane.xdart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true)
		{
			cardManager cc = new cardManager();
			PlayerManager pp = new PlayerManager();
			Scanner console = new Scanner(System.in);
			int playerCount = 0,cardCount = 0;
			System.out.println("请输入玩家数量：");
			try {
				playerCount = console.nextInt();
			} catch (Exception e) {
				System.out.println("请输入整数");
				break;
			}
			
			System.out.println("请输入每人手牌数量:");
			try {
				cardCount = console.nextInt();
			} catch (Exception e) {
				System.out.println("请输入整数");
				break;
			}
			while(playerCount-->0)
			{
				System.out.println("玩家名字:");
				pp.addPlayer(console.next());
			}
			pp.getCardList(cc.cardGame(pp.getPlayerList(), cardCount));
			pp.showPlayerWithCards();
			System.out.println("赢家:"+pp.winer().getName());
		}
		
	}

}
