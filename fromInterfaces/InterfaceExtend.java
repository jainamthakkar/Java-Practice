package fromInterfaces;

interface A4{
	
	void meth1();
	void meth2();
	
	default void meth5() { //Default methods are allowed only in interfaces.
		System.out.println("Default Meth 5");
	}
}

interface B4 extends A4{
	
	void meth3();
	
	static void meth4() {
		System.out.println("static Meth 4");
	}
}

class C implements B4{
	
	public void meth1() {
		System.out.println("Meth1");
	}
	
	public void meth2() {
		System.out.println("Meth2");
	}
	
	public void meth3() { //method declared in interface are by default public so here also we have to define them as public
		System.out.println("Meth3");
	}

}

public class InterfaceExtend {

	public static void main(String[] args) {
		
		C c = new C();
	
		c.meth1();
		c.meth2();
		c.meth3();
		
		B4.meth4();	
		
		c.meth5(); //default method can be called by it's child class
	}
}
