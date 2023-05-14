package enums;

enum Webseries {
	GOT, Breakingbad, Lucifer, Boys, Mirzapur, Moneyheist;
}

public class EnumsSwitch {

	public static void main(String[] args) {
		Webseries wb;
		
		wb = Webseries.Moneyheist;
		System.out.println("It contains: " + wb);
		
		wb = Webseries.Mirzapur;

		switch (wb) {

			case GOT:
				System.out.println("Game of Thrones selected");
				break;
			case Breakingbad:
				System.out.println("Breaking Bad selected");
				break;
			case Lucifer:
				System.out.println("Lucifer selected");
				break;
			case Boys:
				System.out.println("Boys selected");
				break;
			case Mirzapur:
				System.out.println("Mirzapur selected");
				break;
			case Moneyheist:
				System.out.println("Money Heist selected");
				break;
			default:
				System.out.println("You are outdated !!!");
				break;
		}
	}
}
