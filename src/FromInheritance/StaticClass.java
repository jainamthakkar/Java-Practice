package FromInheritance;

public class StaticClass {

	static class A{

		 static final int a = 5;

		A(){
			System.out.println("inside A");
		}

		static int sum(int a, int b) {
			return a+b;
		}
	}

	class B {
		public B() {
			System.out.println("inside B");
		}
	}

	
	public static void main(String[] args) {
		
		A a = new A();
//		B b = new B();

		int ans = A.sum(3, 3); //without using obj we can call static methods and variables from static class just we have to use classname.method(); 
		System.out.println("Ans : " + ans);
		
//		B b = new B();

//		A.a = 10;
		System.out.println(A.a);

	}

}
