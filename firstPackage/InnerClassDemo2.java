package firstPackage;

class Outer4 {
	int Outer_x = 100;

	void test() {
		for (int i = 0; i < 10; i++) {
			class Inner {
				void display() {
					System.out.println("Display: Outer_x =  " + Outer_x);
				}
			}
			Inner in = new Inner();
			in.display();
		}
	}
}

public class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer4 outer = new Outer4();
		outer.test();
	}

}
