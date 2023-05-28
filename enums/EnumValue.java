package enums;


enum Webseries2 {
	GOT, Breakingbad, Lucifer, Boys, Mirzapur, Moneyheist;
}

public class EnumValue {

	public static void main(String[] args) {
		Webseries2 wb;

		System.out.println("All webseries are : ");
//		Webseries2 allwb[] = Webseries2.values();
//		
//		for (Webseries2 wb1 : allwb) 
//			System.out.print(wb1 + "\t");
		
		//is eqals to ^
		
		for (Webseries2 wb1 : Webseries2.values()) 
			System.out.print(wb1 + "    ");
		
		System.out.println();
		
		wb = Webseries2.valueOf("GOT");
		System.out.println("wb contains : " + wb);
	}
}
