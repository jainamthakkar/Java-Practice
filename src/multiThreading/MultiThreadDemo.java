package multiThreading;

class NewThread3 implements Runnable {

	String name;
	Thread th;

	public NewThread3(String threadName) {
		name = threadName;
		th = new Thread(this, name);	
		System.out.println("NewThread : " + th);
	}

	@Override
	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(name + " Inttrupted");
		}
		System.out.println(name + " Exiting !!");
	}
}

public class MultiThreadDemo {

	public static void main(String[] args) {

		NewThread3 nth1 = new NewThread3("One");
		NewThread3 nth2 = new NewThread3("Two");
		NewThread3 nth3 = new NewThread3("Three");

		nth1.th.start();		
		nth2.th.start();		
		nth3.th.start();

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
