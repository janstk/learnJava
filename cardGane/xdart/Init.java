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
			System.out.println("���������������");
			try {
				playerCount = console.nextInt();
			} catch (Exception e) {
				System.out.println("����������");
				break;
			}
			
			System.out.println("������ÿ����������:");
			try {
				cardCount = console.nextInt();
			} catch (Exception e) {
				System.out.println("����������");
				break;
			}
			while(playerCount-->0)
			{
				System.out.println("�������:");
				pp.addPlayer(console.next());
			}
			pp.getCardList(cc.cardGame(pp.getPlayerList(), cardCount));
			pp.showPlayerWithCards();
			System.out.println("Ӯ��:"+pp.winer().getName());
		}
		
	}

}
