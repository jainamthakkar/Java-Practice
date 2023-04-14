package FromInheritance;

public class StaticClass {

	static class A{
		A(){
			System.out.println("inside A");
		}
		
		static int sum(int a, int b) {
			return a+b;
		}
	}
	
	class B extends A{
		public B() {
		System.out.println("inside B");
		}
	}
	
	public static void main(String[] args) {
		
		A obj = new A();
		int ans = A.sum(3, 3); //without using obj we can call static methods and variables from static class just we have to use classname.method(); 
		System.out.println("Ans : " + ans);
		
		B b = new B();
	}

}
