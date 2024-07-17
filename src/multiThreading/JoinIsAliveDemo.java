package multiThreading;

// https://www.javatpoint.com/java-join-method

class NewThread4 implements Runnable {

	String name;
	Thread th;

	public NewThread4(String threadName) {
		name = threadName;
		th = new Thread(this, name);
		System.out.println("NewThread : " + th);
	}

	@Override
	public void run() {

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(name + " Inttrupted");
		}
		System.out.println(name + " Exiting !!");
	}
}

public class JoinIsAliveDemo {

	public static void main(String[] args) {

		NewThread3 nth1 = new NewThread3("One");
		NewThread3 nth2 = new NewThread3("Two");
		NewThread3 nth3 = new NewThread3("Three");

		nth1.th.start();
		nth2.th.start();
		nth3.th.start();

		System.out.println("Thread 1 is alive : " + nth1.th.isAlive());
		System.out.println("Thread 2 is alive : " + nth2.th.isAlive());
		System.out.println("Thread 3 is alive : " + nth3.th.isAlive());

		try {
			System.out.println("waiting for threads to finish");
//			Thread.currentThread().join(); // 	Deadlock
			nth1.th.join();
			nth2.th.join();
			nth3.th.join();
		} catch (InterruptedException e) {
			System.out.println("Main Inttrupted");
		}

		System.out.println("Thread 1 is alive : " + nth1.th.isAlive());
		System.out.println("Thread 2 is alive : " + nth2.th.isAlive());
		System.out.println("Thread 3 is alive : " + nth3.th.isAlive());

		System.out.println("Exiting Main thread");
	}
}

/*
 * Line number: 48, 49, 50, 51
 * 
 * In Java, the code snippet you provided is using the `join()` method on
 * different threads. Let's go through each line to understand what happens:
 * 
 * 1. `Thread.currentThread().join();` The `join()` method is called on the
 * current thread (the thread executing this line of code). This means the
 * current thread will wait for itself to complete. In other words, it will wait
 * indefinitely, causing a deadlock or blocking the current thread indefinitely.
 * 
 * 2. `nth1.th.join();` Here, the `join()` method is called on the thread
 * represented by the variable `nth1.th`. This will cause the current thread
 * (which is executing this line) to wait until the `nth1` thread completes its
 * execution. The current thread will be blocked until `nth1` finishes.
 * 
 * 3. `nth2.th.join();` Similarly, the `join()` method is called on the thread
 * represented by the variable `nth2.th`. The current thread will wait until
 * `nth2` completes its execution before continuing further.
 * 
 * 4. `nth3.th.join();` Again, the `join()` method is called on the thread
 * represented by the variable `nth3.th`. The current thread will wait until
 * `nth3` completes its execution before proceeding.
 * 
 * Essentially, by invoking the `join()` method on a thread, the calling thread
 * will wait for the specified thread to complete its execution before
 * continuing. This allows for synchronization and coordination between multiple
 * threads, ensuring that certain operations are completed before moving
 * forward.
 * 
 * 
 * ==> Removing Thread.currentThread().join(); will prevent the current thread from
 * waiting for itself, but it will still wait for other threads as specified by
 * the remaining join() calls.
 * 
 */
