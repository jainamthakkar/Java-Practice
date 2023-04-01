package firstPackage;

class OverLoadDemo{
	
	OverLoadDemo(int a, int b){
		System.out.println("In Constructor a and b : " + a + " " + b);
	}
	
	
	void test() {
		System.out.println("No Parameters");
	}
	
	void test(int a) {
		System.out.println("a: " + a);		
	}
	
	void test(int a, int b) {
		System.out.println("a: " + a + "b: " + b);		
	}
	
	double test(double a) {
		System.out.println("Double a: " + a);
		return a*a;
	}
}


public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoadDemo ob = new OverLoadDemo(3, 5); // new OverLoadDemo() will raise error it's undefined
												//	we have parameterised constructor so we have to call constructor with parameter	
		ob.test();
		ob.test(0);
		ob.test(1, 2);
		double res = ob.test(12.2112);
		System.out.println("Double res:"+res);
	}
}
