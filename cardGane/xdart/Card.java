package cardGane.xdart;

public class Card {

	private int number;

	private int color; // 4->黑桃 3->红桃 2->梅花 1->方片

	public Card(int number, int color) {
		this.number = number;
		this.color = color;
	}

	public int getColor() {

		return this.color;
	}

	public String getNumber() {
		String num = null;
		switch (number) {
		case 1:
			num = "A";
			break;
		case 11:
			num = "J";
			break;
		case 12:
			num = "Q";
			break;
		case 13:
			num = "K";
			break;
		default:
			num = Integer.toString(number);
			break;
		}
		return num;
	}

	public int getPoint() {
		return number;
	}

	public String getColorName() {
		switch (color) {
		case 4:
			return "黑桃";
		case 3:
			return "红桃";
		case 2:
			return "梅花";
		case 1:
			return "方片";
		}
		return null;
	}
}
