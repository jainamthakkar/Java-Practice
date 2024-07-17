package enums;

public class Wrapper {

	public static void main(String[] args) {
		
//		Integer iob = Integer.valueOf(100);
//		
//		int i = iob.intValue();
//		System.out.println(i + " : " + iob);
		
//		Java handles the details for you.
//		Here is the preceding program rewritten to use autoboxing/unboxing
		Integer iob = 100;		// autobox an int
		int i = iob; // auto-unbox
		System.out.println(i + " : " + iob);
	}
}
