package exceptionHandling;

public class MultipleCatches {

	public static void main(String[] args) {

		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException e) {

			System.out.println("Division by 0 : " + e);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index out of bound :" + e);
		}

		/*
		 * if we pass command line args from cmd than :
		 * 
		 * java MultipleCatches TestArg a = 1 Array index oob:
		 * java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 1
		 * After try/catch blocks.
		 * 
		 */

		System.out.println("After try catch!!");
	}

}
