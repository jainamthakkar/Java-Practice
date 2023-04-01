package FromInheritance;

class A2 {

	private int i;
	private int j;

	A2(int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j : " + i + "  " + j);
	}
}

class B2 extends A2{
	
	private int k;
	B2(int a, int b, int c){
		super(a, b);
		k = c;
	}
	
	//overload show
	void show(String msg) {
		System.out.println(msg + k);
	}
}

public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 obj = new B2(1, 2, 3);
		
		obj.show("This is K : ");
		obj.show();
	}

}
