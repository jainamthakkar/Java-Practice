package multiThreading;
/*
class Q {
	int n;
	boolean value = false;

	synchronized int get() {
	
		while (!value) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted exception caught");
			}
		}
		System.out.println("Got : " + n);
		value = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		
		if (n > 100) return ;
		
		while (value) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted exception caught");
			}
		}
		this.n = n;
		value = true;
		System.out.println("Put : " + n);
		notify();
	}

}

class Producer implements Runnable {
	Q q;
	Thread t;

	Producer(Q obj) {
		this.q = obj;
		t = new Thread(this, "Producer");
	}

	@Override
	public void run() {

		int i = 0;
		while (true)
			q.put(i++);
	}
}

class Consumer implements Runnable {
	Q q;
	Thread t;

	Consumer(Q obj) {
		this.q = obj;
		t = new Thread(this, "consumer");
	}

	@Override
	public void run() {
		while (true)
			q.get();
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {

		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.t.start();
		c.t.start();

		System.out.println("Press controll-C stop");
	}
}
*/

class Q {
	int n;
	boolean valueset = false;

	synchronized int get() {
		while (!valueset)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Thread Interrupted");
			}
		System.out.println("Got : " + n);
		valueset = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
//		if (n < 10 && n > -1) {
			while (valueset)
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("Thread interrupted");
				}
		this.n = n;
		valueset = true;
		System.out.println("put : " + n);
		notify();
//		}
	}
}

class Producer implements Runnable {
	Q q;

	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	Q q;

	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}

class ProducerConsumer {
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("press ctrl+c to exit");
	}
}