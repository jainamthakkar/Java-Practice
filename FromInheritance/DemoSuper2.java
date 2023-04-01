package FromInheritance;

//This second form of super is most applicable to situations in which member
//names of a subclass hide members by the same name in the superclass.

class A{
	int i;
}

class B extends A{
	int i; // this i hides the i in A
	
	B(int a, int b){
		super.i = a;
		i = b;
	}
	
	void show() {
		System.out.println("i in superclass : " + super.i);
		System.out.println("i in subclass : " + i);
	}
	
}

public class DemoSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B oB = new B(2, 4);
		
		oB.show();
	}

}
