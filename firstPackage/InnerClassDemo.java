package firstPackage;

class Outer{
	int Outer_x = 100;
	
	void test() {
		Inner in = new Inner();
		in.display();
	}
	
	class Inner{
		public int y = 10;
		
		void display() {
			System.out.println("Display: Outer_x =  " + Outer_x);
		}
	}
	
//	void showY() {
//		System.out.println(y); // error ==> y is local variable of class Inner which can't accessed by outer class
//	}
}


public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.test();
	}

}
