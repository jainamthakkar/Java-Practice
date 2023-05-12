package exceptionHandling;

public class ChainException {

	static void demo() {
		
		NullPointerException ne = new NullPointerException("top layer");
		ne.initCause(new ArithmeticException("cause"));
		throw ne;
	}
	
	public static void main(String[] args) { 
		
		try {
			demo();
		} catch (NullPointerException e) {

			System.out.println(e);
			
			System.out.println("Original cause : " + e.getCause());
		}
	}
}

///jkjafdoah ouahfoihf