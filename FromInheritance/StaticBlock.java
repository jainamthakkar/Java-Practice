package FromInheritance;

public class StaticBlock {

	static {
		System.out.println("Inside Block 1");
		printHello(); //static block will executes before main method
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main");
	}
	
	static {
		System.out.println("Inside Block 2");
		printHello(); 
	}

	static void printHello() {
		System.out.println("Hello world!!");
	}

}
