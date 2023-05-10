package exceptionHandling;

class NestedTry {

	public static void main(String args[]) {
		try {

			int a[] = { 1, 2, 3, 4, 5 };
			System.out.println(a[6]);

			try {

				int x = a[2] / 0;
			} catch (ArithmeticException e2) {

				System.out.println("Exception " + e2);
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			
			System.out.println("Exception " + e1);
			System.out.println("Element at such index does not exists");
		}
	}
	// end of main method
}