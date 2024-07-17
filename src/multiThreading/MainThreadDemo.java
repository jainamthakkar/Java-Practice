package multiThreading;

/*
 * 	Output :- 
 * 
 * 	Current thread : Thread[main,5,main] 	====>  This displays, in order: the name of the thread, its priority, and the name of its group.
 *	New name : Thread[My Thread,5,main]		====> A thread group is a data structure that controls the state of a collection of threads as a whole.
 *	5
 *	4
 *	3
 *	2
 *	1
 * 
 * */

public class MainThreadDemo {

	public static void main(String[] args) {

		Thread th = Thread.currentThread();
		System.out.println("Current thread : " + th);

		th.setName("My Thread");
		System.out.println("New name : " + th);

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main thread interrupted!!");
		}
	}
}
