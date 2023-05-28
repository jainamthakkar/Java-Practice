package fromInterfaces;

// dynamic stack as the need of stack's size is higher it will create another stack of 2* size

interface IntStack{
	void push(int item);
	int pop();
}


class FixedStack implements IntStack{
	
	private int stck[];
	private int tos;
	
	FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}
	
	 //push
	public void push(int value) {
		
		if (tos == stck.length - 1) {
			int tmp[] = new int[stck.length*2];
			
			for (int i = 0; i < stck.length; i++) 			
				tmp[i] = stck[i];			
			stck = tmp;
			stck[++tos] = value;
			
//			System.out.println("stack is full");
		}else {
			stck[++tos] = value;			
		}
	}
	
//	pop
	
	public int pop() {
		
		if (tos < 0) {
			System.out.println("stack is empty");
			return -1;
		}		
		else
			return stck[tos--];
	}
}


public class InterfaceIfTest {

	public static void main(String[] args) {
		
		FixedStack fs1 = new FixedStack(5);
		FixedStack fs2 = new FixedStack(8);
		
		//push
		for (int i = 0; i < 7; i++) 
			fs1.push(i);
		for (int i = 0; i < 15; i++) 
			fs2.push(i+1);
		
		
		//pop
		System.out.println("Stack 1 :- ");
		for(int i = 0; i < 7; i++)
			System.out.println(fs1.pop());
		
		System.out.println("Stack 2 :- ");
		for(int i = 0; i < 15; i++)
			System.out.println(fs2.pop());
	}

}
