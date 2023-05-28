package multiThreading;

class NewThreadDemo2 implements Runnable{
	
	String name;
	Thread t;
	boolean flag;
	public NewThreadDemo2(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread : " + t);
		flag = false;
	}
	
	public void run() {
		try {
			for(int i = 15; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
				synchronized (this) {
					while(flag)
						wait();
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " Intrrupted");
		}
		System.out.println(name + " exiting");
	}
	
	synchronized void mysuspend() {
		flag = true;
	}
	
	synchronized void myresume() {
		flag = false;
		notify();
	}
	
}

public class SuspendResume {

	public static void main(String[] args) {

		NewThreadDemo2 obj1 = new NewThreadDemo2("one");
		NewThreadDemo2 obj2 = new NewThreadDemo2("two");
		
		obj1.t.start();
		obj2.t.start();
		
		try {
			Thread.sleep(1000);
			obj1.mysuspend();
			System.out.println("Suspending Thread one");
			
			Thread.sleep(1000);
			obj1.myresume();
			System.out.println("Resuming Thread one");
			
			obj2.mysuspend();
			System.out.println("Suspending Thread two");

			Thread.sleep(1000);
			obj2.myresume();
			System.out.println("Resuming Thread two");
		} catch (InterruptedException e) {

			System.out.println("Main Thread Interrupted");
		}
		
		try {
			
			System.out.println("Waiting for threads to finish");
			obj1.t.join();
			obj2.t.join();
		} catch (InterruptedException e) {
			
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread exiting");
	}
}
