package fromInterfaces;

interface PrivateMethods{
	
	void ex1();
	default void ex2() {
		System.out.println("Default ex2");
		ex3();
	}
	private void ex3() {
		System.out.println("Private ex3");
	}
}

interface PrivateMethods2 extends PrivateMethods{
	
	void ex4();
	static void ex5() {
		System.out.println("Static ex5");
//		ex6();  // static method cannot call private methods
	}
	private void ex6() {
		System.out.println("Private ex");
	}
}

public class DefaultPrivateIf implements PrivateMethods2 {

	public void ex1() {
		System.out.println("ex1");
	}
	
	@Override
	public void ex4() {
		System.out.println("override ex4");
	}
	
	public static void main(String[] args) {
		
		DefaultPrivateIf dp = new DefaultPrivateIf();
		dp.ex1();
		dp.ex2();
		dp.ex4();
		PrivateMethods2.ex5();
	}

}
