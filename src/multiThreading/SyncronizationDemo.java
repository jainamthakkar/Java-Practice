package multiThreading;

class CallMe {

	void call(String msg) { //	try :- synchronized void call(String msg) 
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000); 	//	As you can see, by calling sleep( ), the call( ) method allows execution to
//										switch to another thread. This results in the mixed-up output of the three
//										name strings
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class NewThread5 implements Runnable {

	CallMe target;
	String name;
	Thread th;

	public NewThread5(CallMe tgt, String threadName) {
		target = tgt;
		name = threadName;
		th = new Thread(this, name);
	}

	@Override
	public void run() {

		target.call(name);
	}
}

public class SyncronizationDemo {

	public static void main(String[] args) {

		CallMe cm = new CallMe();
		NewThread5 nth1 = new NewThread5(cm, "One");
		NewThread5 nth2 = new NewThread5(cm, "Two");
		NewThread5 nth3 = new NewThread5(cm, "Three");

		nth1.th.start();
		nth2.th.start();
		nth3.th.start();

		
//		try {
//			System.out.println("child!!"); // if here i include main thread to wait then child will be executed bcs for that time cpu will be navara so...
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			System.out.println("Main Inttrupted");
//		}
		
		
		try {
			System.out.println("Main is waiting for child threads to finish !!");
			nth1.th.join();
			nth2.th.join();
			nth3.th.join();
		} catch (InterruptedException e) {
			System.out.println("Main Inttrupted");
		}

		System.out.println("Exiting Main thread");
	}
}