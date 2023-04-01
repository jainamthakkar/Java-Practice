package firstPackage;

class TestStack{
	private int stck[] = new int[10];
	private int tos;
	
	//initialize top of stack
	TestStack() {
		tos = -1;
	}
	
	//push
	void push(int item) {
		if (tos == 9) {
			System.out.println("Overflow!!");
		}
		else {
			stck[++tos] = item;
		}
	}
	
	int pop() {
		if(tos == -1) {
			System.out.println("Underflow!!");
			return 0;
		}
		else {
			return stck[tos--];
		}
	}
	
}

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestStack obj1 = new TestStack();
		TestStack obj2 = new TestStack();
		
		for (int i = 0; i < 10; i++) {
			obj1.push(i);
			obj2.push(i+10);
		}
		//they are private can't be accessed
//		obj1.tos = 0;//ERROR!!
//		obj2.stck[3] = 100; //ERROR!!
		
		System.out.println("Data of stacks1 and 2 :");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(obj1.pop());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(obj2.pop());
		}
					
	}

}
