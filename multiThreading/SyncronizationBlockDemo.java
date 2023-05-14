package multiThreading;

class CallMe6 {

	void call(String msg) {  
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

class NewThread6 implements Runnable {

	CallMe6 target;
	String name;
	Thread th;

	public NewThread6(CallMe6 tgt, String threadName) {
		target = tgt;
		name = threadName;
		th = new Thread(this, name);
	}

	@Override
	public void run() {
		synchronized (target) {			
			target.call(name);
		}
	}
}

public class SyncronizationBlockDemo {

	public static void main(String[] args) {

		CallMe6 cm = new CallMe6();
		NewThread6 nth1 = new NewThread6(cm, "One");
		NewThread6 nth2 = new NewThread6(cm, "Two");
		NewThread6 nth3 = new NewThread6(cm, "Three");

		nth1.th.start();
		nth2.th.start();
		nth3.th.start();	
		
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
