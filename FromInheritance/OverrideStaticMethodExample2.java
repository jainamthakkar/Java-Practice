package FromInheritance;

public class OverrideStaticMethodExample2 {
	
	public static void main(String args[]) {

		ParentClass.display();
		ChildClass.display();
	}
}

class ParentClass {
  
	public static void display() {
		
		System.out.println("display() method of the parent class.");
	}
}

class ChildClass extends ParentClass {

	public static void display() {
	
		System.out.println("Overridden static method in Child Class in Java");
	}
}
