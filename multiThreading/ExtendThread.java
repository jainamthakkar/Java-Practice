package multiThreading;

class NewThread2 extends Thread {

	NewThread2() {
		super("Demo Thread");
		System.out.println("Child Thread : " + this);
	}

	// entry point for second thread
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("Inttruption in child thread");
		}
		System.out.println("Exiting child thread");
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		NewThread2 nt = new NewThread2();

		nt.start();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main Thread " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Inttruption in main thread");
		}
		System.out.println("Exiting main thread");
	}
}
