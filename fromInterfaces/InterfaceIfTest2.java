package fromInterfaces;

interface IntStack2 {

	void push(int item);

	int pop();
}

class FixedStck2 implements IntStack2 {

	private int stck[];
	private int tos;

	FixedStck2(int size) {
		stck = new int[size];
		tos = -1;
	}

	// push
	public void push(int value) {

		if (tos == stck.length - 1) {
			System.out.println("stack is full");
		} else {
			stck[++tos] = value;
		}
	}

	public int pop() {

		if (tos < 0) {
			System.out.println("stack is empty");
			return -1;
		} else
			return stck[tos--];
	}
}

class DynamicStck implements IntStack2 {

	private int stck[];
	private int tos;

	DynamicStck(int size) {
		stck = new int[size];
		tos = -1;
	}

	// push
	public void push(int value) {

		if (tos == stck.length - 1) {
			int tmp[] = new int[stck.length * 2];

			for (int i = 0; i < stck.length; i++)
				tmp[i] = stck[i];
			stck = tmp;
			stck[++tos] = value;

//			System.out.println("stack is full");
		} else {
			stck[++tos] = value;
		}
	}

//	pop
	public int pop() {

		if (tos < 0) {
			System.out.println("stack is empty");
			return -1;
		} else
			return stck[tos--];
	}
}

public class InterfaceIfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntStack2 mystck; // interface reference variable
		DynamicStck ds1 = new DynamicStck(5);
		FixedStck2 fs2 = new FixedStck2(10);

		mystck = ds1;
		for (int i = 0; i < 10; i++) //dynamiclly size will be increased
			mystck.push(i);

		mystck = fs2;
		for (int i = 0; i < 10; i++)
			mystck.push(i);

		// pop
		mystck = ds1;
		System.out.println("Stack 1 :- ");
		for (int i = 0; i < 10; i++)
			System.out.println(mystck.pop());

		mystck = fs2;
		System.out.println("Stack 2 :- ");
		for (int i = 0; i < 10; i++)
			System.out.println(mystck.pop());
	}

}
