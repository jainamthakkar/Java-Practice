package FromInheritance;

class A1{
	
	A1() {
		System.out.println("Inside A ==> Default");
	}
}

class B1 extends A1{ 
	
	B1(){
		System.out.println("Inside B ==> Default");
	}
}

class C1 extends B1{
	
	C1(){
		System.out.println("Inside C ==> Default");
	}
}

public class CallingCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
	}

}
