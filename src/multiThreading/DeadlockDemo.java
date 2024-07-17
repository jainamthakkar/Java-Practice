package multiThreading;

class A {

	synchronized void foo(B b) {

		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.foo()");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("A interrupted");
		}

		System.out.println(name + " trying to call B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("Inside a.Last()");
	}
}

class B {
	
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");

		try
		{
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("B interrupted");
		}

		System.out.println(name + " trying to call A.last()");
		a.last(); // try to comment a.last and b.last and observe
	}

	synchronized void last() {
		System.out.println("Inside B.Last()");
	}
}

public class DeadlockDemo implements Runnable {

	A a = new A();
	B b = new B();
	Thread t;
	
	DeadlockDemo(){
		Thread.currentThread().setName("mainThread");
		t = new Thread(this, "racingThread");
	}
	
	void deadlockStarts() {
		t.start();
		a.foo(b); // get on deadlock on this thread
		System.out.println("Back on main thread");
	}
	
	@Override
	public void run() {
		b.bar(a);
		System.out.println("back in other thread");
	}
	
	public static void main(String[] args) {
		DeadlockDemo d = new DeadlockDemo();
		d.deadlockStarts();
	}
}

