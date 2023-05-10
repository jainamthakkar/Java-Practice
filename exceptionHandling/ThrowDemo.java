package exceptionHandling;

public class ThrowDemo {

	static void demo() {
		
		
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {

			System.out.println("Caught under demo");
			throw e;// rethrow exception
		}
	}

	public static void main(String[] args) {

		try {
			demo();
		} catch (NullPointerException e) {
			System.out.println("Recaught demo : " + e);
		}

	}

}
