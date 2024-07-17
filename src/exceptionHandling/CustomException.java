package exceptionHandling;

class MyException extends Exception {
	private int detail;

	MyException(int a) {
		detail = a;
	}

	@Override
	public String toString() {
		return "Myexception[" + detail + "]";
	}
}

public class CustomException {

	static void compute(int a) throws MyException {
		System.out.println("called compute (" + a + ")");
		if (a > 10)
			throw new MyException(a);
		System.out.println("normal exit");
	}

	public static void main(String[] args) {

		try {
			compute(1);
			compute(11);
		} catch (MyException e) {

			System.out.println("Exceptin caught " + e);
		}
	}
}
