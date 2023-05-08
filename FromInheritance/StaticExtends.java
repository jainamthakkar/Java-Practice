package FromInheritance;

class A12{
	static int sum(int a, int b) {
		return a+b;
	}
}

class B12 extends A12{
	static int sub(int a, int b) {
		return a-b;
	}
}

public class StaticExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(B12.sum(1, 3));
		System.out.println(B12.sub(1, 3));
	}

}
