package firstPackage;

class Test2{
	int a;
	public int b;
	private int c;
	
	void setc(int i) { // setter
		c = i;
	}
	
	int getc() { // getter
		return c;
	}
}

public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		
		obj.a = 1;
		obj.b = 2;
		
//		obj.c = 3;
		
		obj.setc(100);
		System.out.println("a, b and c :" + obj.a + " " + obj.b + " " + obj.getc());
	}

}
