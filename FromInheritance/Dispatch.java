package FromInheritance;

// ?	?	? page no :- 320 (JAVA the complete Reference)

class A3 {
	void callme() {
		System.out.println("It's A3");
	}
}

class B3 extends A3 {
	void callme() { // override
		System.out.println("It's B3");
	}
}

class C3 extends A3 {
	void callme() { // override
		System.out.println("it's C3");
	}
}

public class Dispatch {
	public static void main(String[] args) {
		
		A3 a3 = new A3();
		B3 b3 = new B3();
		C3 c3 = new C3();
		
		A3 r; 

		r = a3; //now reference variable will able to access methods of class A3 bcz a3 is object of an A3
		r.callme();
		
		r = b3;
		r.callme();		
		
		r = c3;
		r.callme();
	}
}
