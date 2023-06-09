package multiThreading;

class NewThread implements Runnable {

	Thread th;

	public NewThread() {
		th = new Thread(this, "Demo Thread");	//	Passing this as the first argument indicates that you want the new thread to call
//													the run( ) method on this object.
		System.out.println("Children Thread : " + th);
	}

	@Override
	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child Thread : " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Child Inttrupted");
		}
		System.out.println("Exiting child thread");
	}
}

public class NewThreadDemo {

	public static void main(String[] args) {

		NewThread nth = new NewThread();
		nth.th.start();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Main Inttrupted");
		}
		System.out.println("Exiting Main thread");
	}
}
