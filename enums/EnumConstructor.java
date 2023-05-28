package enums;

enum Webseries3 {
	GOT(5), Breakingbad(10), Lucifer(12), Boys(21), Mirzapur(22), Moneyheist(25); // we can say them instance of this
																					// enum, so there value is passed to
																					// the accordingly thir constructor

	private int val;

	Webseries3(int i) {
		val = i;
	}

	int getValue() {
		return val;
	}
}

public class EnumConstructor {

	public static void main(String[] args) {

		System.out.println("webseriese Value : " + Webseries3.Lucifer.getValue());

		System.out.println("All Webseries value : ");
		for (Webseries3 w : Webseries3.values()) {
			System.out.println(w + " value " + w.getValue());
		}
	}
}
