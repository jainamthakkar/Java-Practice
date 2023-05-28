package fromInterfaces;

//The variables defined in an interface can not be modified by the class that implements the interface, 
//but it may use as it defined in the interface. 
//######	The variable in an interface is public, static and final by default.	 #######


interface demo {
	int a = 0;
	int b = 0;
	String s = "Jainam";
	
	void hello(int a);
}

class A implements demo {

	public void hello(int a) {
		
		System.out.println("Hello a : " + a);
		a = a + 2;
		System.out.println("new value of a : " + a);
	}
	
}


class B implements demo {
	
	public void hello(int bPara) {
		
		System.out.println(s + b + bPara);
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {

		A a = new A();
		a.hello(3);
		
		B obj = new B();
		obj.hello(22);
	}

}
